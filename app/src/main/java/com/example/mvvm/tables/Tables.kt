package com.example.mvvm.tables

import android.content.ClipData.Item
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.example.mvvm.navigation.ROUTE_VIEWPRODUCTS

@Composable

fun Tables(navController: NavController){
    LazyColumn (modifier = Modifier){
        item {
            Column {
                Spacer(modifier = Modifier.height(50.dp))

                Text("Find your table for ",
                    modifier = Modifier,
                    fontWeight = FontWeight.Bold,
                            style = TextStyle(fontSize = 30.sp)




                )

                Text("any occasion",
                    modifier = Modifier,
                    fontWeight = FontWeight.Bold,
                    style = TextStyle(fontSize = 30.sp)




                )

                Spacer( modifier = Modifier.height(20.dp))

                Text("Discover and book the best restaurant")




                var text by remember { mutableStateOf(TextFieldValue("")) }
                OutlinedTextField(
                    value = text,
                    trailingIcon = { Icon(imageVector = Icons.Default.LocationOn, contentDescription = "callIcon") },



                    onValueChange = {
                        text = it
                    },
                    label = { Text(text = "Select your location") },
                    placeholder = { Text(text = "+2547 000 000 00") },
                )

                Spacer(modifier = Modifier.height(10.dp))

                Row (modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxSize()
                    .fillMaxHeight()



                )
                {

                    Text(
                        "Categories",
                        modifier = Modifier,
                        fontWeight = FontWeight.Bold,
                        style = TextStyle(fontSize = 30.sp)


                    )

                    Spacer(modifier = Modifier.width(150.dp))

                    Text("See all",
                            modifier = Modifier
                                .clickable { navController.navigate(ROUTE_VIEWPRODUCTS) },
                                                     fontWeight = FontWeight.SemiBold,
                                                     style = TextStyle(fontSize = 15.sp)
                                                                          

                    )










                }
                LazyRow {
                    item {
                        Column(  modifier = Modifier,
                        horizontalAlignment = Alignment.CenterHorizontally){


                                   OutlinedCard {
                                        AsyncImage(
                                                  model = "https://theeburgerdude.com/wp-content/uploads/2022/09/9093e9_0c4e70b12b0843d3a2c78207361932d1_mv2.webp",
                                                  contentDescription = null,
                                                   modifier = Modifier
                                                      .size(100.dp)
                                                       .clickable { navController.navigate(ROUTE_VIEWPRODUCTS ) }


                                                               )



                                   }


                                                           Text(
                                                               "Burger",
                                                               modifier = Modifier,
                                                               fontWeight = FontWeight.SemiBold

                                                               )













                        }

                        Spacer(modifier = Modifier.width(5.dp))

                        Column ( modifier = Modifier,
                            horizontalAlignment = Alignment.CenterHorizontally){


                            OutlinedCard {
                                AsyncImage(
                                    model = "https://ministryofcurry.com/wp-content/uploads/2021/05/chicken-shawarma-6.jpg",
                                    contentDescription = null,
                                    modifier = Modifier
                                        .size(100.dp)
                                        .clickable { navController.navigate(ROUTE_VIEWPRODUCTS ) }


                                )



                            }


                            Text(
                                "Shawarma",
                                modifier = Modifier,
                                fontWeight = FontWeight.SemiBold

                            )













                        }


                        Spacer(modifier = Modifier.width(5.dp))

                        Column( modifier = Modifier,
                            horizontalAlignment = Alignment.CenterHorizontally) {


                            OutlinedCard {
                                AsyncImage(
                                    model = "https://twomarketgirls.com/wp-content/uploads/2020/03/IMG_2393-2.jpg",
                                    contentDescription = null,
                                    modifier = Modifier
                                        .size(100.dp)
                                        .clickable { navController.navigate(ROUTE_VIEWPRODUCTS ) }


                                )



                            }


                            Text(
                                "Pizza",
                                modifier = Modifier,
                                fontWeight = FontWeight.SemiBold

                            )













                        }

                        Spacer(modifier = Modifier.width(5.dp))



                        Column( modifier = Modifier,
                            horizontalAlignment = Alignment.CenterHorizontally) {


                            OutlinedCard {
                                AsyncImage(
                                    model = "https://4sonrus.com/wp-content/uploads/2022/07/Homemade-Gyros-3.jpg",
                                    contentDescription = null,
                                    modifier = Modifier
                                        .size(100.dp)
                                        .clickable { navController.navigate(ROUTE_VIEWPRODUCTS ) }


                                )



                            }


                            Text(
                                "Gyros",
                                modifier = Modifier,
                                fontWeight = FontWeight.SemiBold

                            )













                        }

                        Spacer(modifier = Modifier.width(5.dp))

                        Column( modifier = Modifier,
                            horizontalAlignment = Alignment.CenterHorizontally) {


                            OutlinedCard {
                                AsyncImage(
                                    model = "https://img.buzzfeed.com/thumbnailer-prod-us-east-1/7f539fc41a5543aebfe03afed73a0b48/BFV9112_MozzarellaStickOnionRings.jpg",
                                    contentDescription = null,
                                    modifier = Modifier
                                        .size(100.dp)
                                        .clickable { navController.navigate(ROUTE_VIEWPRODUCTS ) }


                                )



                            }


                            Text(
                                "Onion Rings",
                                modifier = Modifier,
                                fontWeight = FontWeight.SemiBold

                            )













                        }
                        Spacer(modifier = Modifier.width(5.dp))


                        Column( modifier = Modifier,
                            horizontalAlignment = Alignment.CenterHorizontally) {


                            OutlinedCard {
                                AsyncImage(
                                    model = "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiQ1YEnWUOdt128zUAKRAKHKoCLI3xGQbRwKaow4K9VwWta4tiFvXse_QAOdBV_8yw57lZzyKFLbKJ_MIM0M7sTUcMBmRSQyEzBg156-SZVNC2_rdQqmQ9Upsgr1V0I3s9PP4lTzBcyGd0/s400/0000000000000000000000A+%25281%2529.jpg",
                                    contentDescription = null,
                                    modifier = Modifier
                                        .size(100.dp)
                                        .clickable { navController.navigate(ROUTE_VIEWPRODUCTS ) }


                                )



                            }


                            Text(
                                "Fish",
                                modifier = Modifier,
                                fontWeight = FontWeight.SemiBold

                            )













                        }

                        Spacer(modifier = Modifier.width(5.dp))

                        Column (
                            modifier = Modifier,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ){


                            OutlinedCard {
                                AsyncImage(
                                    model = "https://sausagemaker.com/wp-content/uploads/Homemade-French-Fries_8.jpg",
                                    contentDescription = null,
                                    modifier = Modifier
                                        .size(100.dp)
                                        .clickable { navController.navigate(ROUTE_VIEWPRODUCTS ) }


                                )



                            }


                            Text(
                                "Fries",
                                modifier = Modifier,
                                fontWeight = FontWeight.SemiBold

                            )













                        }

                        Spacer(modifier = Modifier.width(5.dp))

                        Column(
                            modifier = Modifier,
                          horizontalAlignment = Alignment.CenterHorizontally
                        ) {


                            OutlinedCard {
                                AsyncImage(
                                    model = "https://downshiftology.com/wp-content/uploads/2023/01/How-To-Make-Air-Fryer-Chicken-5.jpg",
                                    contentDescription = null,
                                    modifier = Modifier
                                        .size(100.dp)
                                        .clickable { navController.navigate(ROUTE_VIEWPRODUCTS ) }


                                )



                            }


                            Text(
                                "Chicken Breast",
                                modifier = Modifier,
                                fontWeight = FontWeight.SemiBold,


                            )















                        }


                        Spacer(modifier = Modifier.width(5.dp))



                    Column ( modifier = Modifier,
                        horizontalAlignment = Alignment.CenterHorizontally){
                             OutlinedCard {
                                 AsyncImage(
                                     model = "https://1stdistilleries.co.za/wp-content/uploads/2023/03/cocktails.jpg",
                                     contentDescription = null,
                                     modifier = Modifier
                                         .size(100.dp)
                                         .clickable { navController.navigate(ROUTE_VIEWPRODUCTS ) }


                                 )



                             }


                             Text(
                                 "Cocktails",
                                 modifier = Modifier,
                                 fontWeight = FontWeight.SemiBold

                             )







                        }











                        }








                    }
                Spacer(modifier = Modifier.height(10.dp))


                Row (modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxSize()
                    .fillMaxHeight()



                )
                {

                    Text(
                        "Near You",
                        modifier = Modifier,
                        fontWeight = FontWeight.Bold,
                        style = TextStyle(fontSize = 30.sp)


                    )

                    Spacer(modifier = Modifier.width(180.dp))

                    Text("See all",
                        modifier = Modifier
                            .clickable { navController.navigate(ROUTE_VIEWPRODUCTS) },
                        fontWeight = FontWeight.SemiBold,
                        style = TextStyle(fontSize = 15.sp)


                    )










                }

                LazyRow {
                    item {
                        Column (){
                            Row {


                                AsyncImage(
                                    model = "https://www.sarahurban.com.au/cdn/shop/files/TableSetting-SarahUrban-0899.sRGB_120dpi_WEB_800x.jpg",
                                    contentDescription = null,
                                    modifier = Modifier
                                        .size(300.dp)
                                        .clickable { navController.navigate(ROUTE_VIEWPRODUCTS) }





                                )
                                Spacer(modifier = Modifier.width(5.dp))



                                AsyncImage(
                                    model = "https://st.depositphotos.com/1993019/3779/i/450/depositphotos_37797357-stock-photo-table-setting-in-fine-dining.jpg",
                                    contentDescription = null,
                                    modifier = Modifier
                                        .size(300.dp)
                                        .clickable { navController.navigate(ROUTE_VIEWPRODUCTS) }


                                )

                                Spacer(modifier = Modifier.width(5.dp))



                                AsyncImage(
                                    model = "https://www.shutterstock.com/image-photo/table-full-homemade-food-600nw-350705489.jpg",
                                    contentDescription = null,
                                    modifier = Modifier
                                        .size(300.dp)
                                        .clickable { navController.navigate(ROUTE_VIEWPRODUCTS) }


                                )













                            }


                            Column {


                                AsyncImage(
                                    model = "https://as1.ftcdn.net/v2/jpg/02/22/76/10/1000_F_222761055_jl4dpjCtMbtTocEjV1Im7YMCBE28il3H.jpg",
                                    contentDescription = null,
                                    modifier = Modifier
                                        .size(20.dp))



                                            Text(
                                    "HOTEL BOULEVARD",
                                    modifier = Modifier
                                        .size(500.dp),
                                    fontWeight = FontWeight.Bold,


                                    )
                            }





































                        }
































                    }





















                }






























                    }












                }





































                }





















            }










































































































































































