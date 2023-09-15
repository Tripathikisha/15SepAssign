        package com.example.demo;
        import org.springframework.stereotype.Component;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RestController;

        @Component
        @RestController
        public class User {
                 private Integer UserId;
            private String Name;
            private String UserName;
            private String Address;
            private Integer Phone_Number;

                public User(Integer UserId, String Name, String UserName, String Address, Integer Phone_Number){
                    this.UserId = UserId;
                    this.Name = Name;
                    this.UserName = UserName;
                    this.Address = Address;
                    this.Phone_Number = Phone_Number;
                }
            public Integer getUserId() {
                return UserId;
            }

            public void setUserId(int userId) {
                UserId = userId;
            }

            public String getName() {
                return Name;
            }

            public void setName(String name) {
                Name = name;
            }

            public String getUserName() {
                return UserName;
            }

            public void setUserName(String userName) {
                UserName = userName;
            }

            public String getAddress() {
                return Address;
            }

            public void setAddress(String address) {
                Address = address;
            }

            public Integer getPhone_Number() {
                return Phone_Number;
            }

            public void setPhone_Number(int phone_Number) {
                Phone_Number = phone_Number;
            }


            public void setUserStatus(boolean userStatus) {
            }
        }
