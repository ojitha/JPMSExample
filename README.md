# JPMS Example Project

This example demonstrates Java Platform Module System (JPMS) concepts including service provider interface pattern, module dependencies, and service loading.

## Project Structure

The project consists of three modules:

### Service Module
- **Purpose**: Defines the service interface
- **Exports**: `com.github.ojitha.service.a.OjService` interface
- **Key Class**: `OjService` - interface with `printHello()` method

### Provider Module  
- **Purpose**: Implements the service interface
- **Dependencies**: Service module, java.logging
- **Provides**: Implementation of `OjService` via `M` class
- **Key Class**: `M` - implements `OjService` using Java logging

### Application Module
- **Purpose**: Consumes the service using ServiceLoader
- **Dependencies**: Service module
- **Uses**: `OjService` via ServiceLoader pattern
- **Key Class**: `HelloWorld` - main application that loads and uses the service

## JPMS Features Demonstrated

- **Module Dependencies**: `requires` declarations
- **Service Provider Interface**: `provides...with` and `uses` declarations  
- **Package Exports**: `exports` declarations
- **ServiceLoader**: Runtime service discovery and loading

## Reference

Created as example source for [Understand JPMS](https://ojitha.github.io/java/2021/03/27/Understand-JPMS.html).
