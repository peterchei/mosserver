# PowerShell script to start Apache Derby server
# Assumes DERBY_HOME is set to the path where Derby is installed
# Download Derby from https://db.apache.org/derby/derby_downloads.html if not present

if (-not $env:DERBY_HOME) {
    Write-Host "DERBY_HOME environment variable is not set. Please set it to the Derby installation directory."
    exit 1
}

# Create db directory if it doesn't exist
if (-not (Test-Path "db")) {
    New-Item -ItemType Directory -Path "db"
}

Set-Location "db"

# Start Derby server
& java -jar "$env:DERBY_HOME\lib\derbyrun.jar" server start
