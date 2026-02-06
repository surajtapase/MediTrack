# JVM & Exception Handling Report

## JVM Overview
- JVM loads classes, manages memory, and executes bytecode.
- Heap is used for object storage.
- Stack is used for method calls.

## Garbage Collection
- Automatically removes unused objects.
- Prevents memory leaks.
- Improves application performance.

## Exception Strategy
Custom exceptions are used to handle business errors:

### Implemented Exceptions
- InvalidDataException
- AppointmentNotFoundException

## Why Custom Exceptions
- Clear error meaning
- Cleaner service logic
- Better debugging
- Interview-ready design

## Example
If an appointment is not found:
- System throws AppointmentNotFoundException
- Application does not crash
- User receives meaningful message
