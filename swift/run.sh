rm -rf ./build
mkdir build
cd build
echo "Creating object files..."
swiftc -c ../*.swift -module-name ResultExample
echo "Building executable..."
swiftc -emit-executable *.o -o ResultExample
echo "Cleaning up..."
rm ./*.o
echo "Running:\n"
./ResultExample