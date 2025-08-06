@echo off
echo 🚀 三级缓存日志系统演示
echo ==========================

REM 启动应用
echo 1. 启动Spring Boot应用...
start /B gradlew bootRun

REM 等待应用启动
echo 2. 等待应用启动...
timeout /t 30 /nobreak > nul

REM 测试缓存功能
echo 3. 测试缓存功能...

REM 第一次请求 - 应该缓存未命中
echo    第一次请求 (缓存未命中):
curl -s "http://localhost:8080/api/cache/test/actions/test1"

timeout /t 2 /nobreak > nul

REM 第二次请求 - 应该缓存命中
echo    第二次请求 (缓存命中):
curl -s "http://localhost:8080/api/cache/test/actions/test1"

timeout /t 2 /nobreak > nul

REM 第三次请求 - 应该缓存命中
echo    第三次请求 (缓存命中):
curl -s "http://localhost:8080/api/cache/test/actions/test1"

timeout /t 2 /nobreak > nul

REM 查看缓存统计
echo 4. 查看缓存统计信息:
curl -s "http://localhost:8080/api/cache/statistics"

echo.
echo ✅ 演示完成！
echo 📊 你可以访问以下URL查看详细信息:
echo    - 缓存统计: http://localhost:8080/api/cache/statistics
echo    - 健康检查: http://localhost:8080/api/cache/statistics/health
echo    - 测试接口: http://localhost:8080/api/cache/test/info

echo.
echo 按任意键停止应用...
pause > nul

REM 停止应用
taskkill /F /IM java.exe
echo 应用已停止 