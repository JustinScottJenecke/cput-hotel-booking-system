
# CPUT-Hotel-Booking-System
Compiled and written by: Justin Jenecke - 215163052

Date compiled: 14 September 2021

## Management system for hotel booking operations.

  This project is a reboot of previous project with more consideration for DDD, 
  less workload and more focus on developing a microservice within the bounded context of a booking system.

## Technology stack remains mostly unchanged from previous project:
  - Java
  - Spring-Boot
  - Apache Maven
  - Hibernate
  - MySQL
  - Thymeleaf
  

## Additions of:
  - H2 (Repository Testing)
  - Spring Security

## The main Entities concerned are

### Room - Entity
  The Room entity is a concrete class that holds information on the different rooms inside the hotel such as cost, floor, etc.
  It also has internal state which is used when creating bookings to ensure no two users can reserve/book the same room on the same date.
  
####Room has four associated composition classes:
    BedType  -  class / entity
    RoomType  -  class / entity
    RoomDetails  -  enum / value object
    BookingCalendar  - class / enity


### Guest - Entity
  Guest entity is a concrete class meant to represent guests registered on a hotel's system, and they will need 
  to register in order to book a room and stay at the hotel.
  
  ####Guest has three associated composition classes:
     Particulars  -  class / entity
     ContactDetails   -  class / entity
     Logistics  -  class / entity

### Booking - Aggregate
  Transactional aggregate that is made up of Guests booking Rooms.
   - Each individual booking can only belong to one Guest and one Room at a time
   - However, one Guest and Room can have multiple bookings
  
  The length of a single booking used in analytics and derived attributes by both the Room and Guest involved with creating it.


## Business Rules and Operations

The primary use case for this system is the booking of hotel rooms by registered hotel guests and users.
Bookings are made via transactions, when a User books or reserves a Room.
#### Room
    many Room : 1 BedType
    many Room : 1 RoomType
    many Room : 1 RoomDetails

    1 Room : 1 BookingCalendar

    1 BookingCalendar : 9 CalendarMonth

#### Guest
    1 Guest : 1 Particular
    1 Guest : 1 ContactDetails
    1 Guest : 1 Logistics

#### Booking
    1 Booking : 1 Guest
    1 Booking : 1 Room

    1 Room : many Booking
    1 Guest : many Booking

## API and Methods:
