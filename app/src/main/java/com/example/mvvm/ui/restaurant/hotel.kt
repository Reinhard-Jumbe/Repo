package com.example.mvvm.ui.restaurant

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage


@Composable
fun hotel(navController: NavController){

    LazyColumn {
         item {
             Column {


                 Spacer(modifier = Modifier.height(50.dp))


                 Row (

                     modifier =  Modifier
                         .fillMaxWidth()
                         .fillMaxSize()
                         .fillMaxHeight(),
                     horizontalArrangement = Arrangement.Center




                 ){




                     AsyncImage(
                         model = "https://img.freepik.com/premium-vector/logo-hotel-design-template-collection_737924-4255.jpg?",
                         contentDescription = null,
                         modifier = Modifier
                             .size(100.dp)
                             .clip(CircleShape)
//                            .border(2.dp, Color.Black, CircleShape)
                             .background(color = Color.White)
//                            .clickable { navController.navigate(ROUTE_BUY) }



                     )




                 }










                 Row (
                     modifier = Modifier
                         .fillMaxWidth()
                         .fillMaxSize()

                 ){
                     Column {

                         Text(
                             "Welcome to ",
                             modifier = Modifier,
                             style = TextStyle(fontSize = 30.sp),

                             fontWeight = FontWeight.Bold


                         )


                         Text(
                             "JAHTELO HOTEL ",
                             modifier = Modifier,
                             style = TextStyle(fontSize = 30.sp),

                             fontWeight = FontWeight.Bold


                         )
                     }


                     Spacer(modifier = Modifier.width(100.dp))

                     AsyncImage(
                         model = "https://img.freepik.com/premium-vector/luxury-royal-logo_647963-2350.jpg?semt=ais_hybrid",
                         contentDescription = null,
                         modifier = Modifier
                             .size(200.dp)





                     )




                 }


                 Spacer(modifier = Modifier.height(1.dp))

                 Row {

                     Column {




                             AsyncImage(
                                 model = "https://images.unsplash.com/photo-1551882547-ff40c63fe5fa?q=80&w=1470&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D.png",
                                 contentDescription = null,
                                 modifier = Modifier
                                     .size(400.dp)


                             )
                         Spacer(modifier = Modifier.height(10.dp))








                         }

                         Text(
                             "HOTEL BOULEVARD",
                                     modifier = Modifier
                                     .size(500.dp),
                             fontWeight = FontWeight.Bold,


                         )









                     }






                 }





                     Column {




                         AsyncImage(
                             model = "https://images.unsplash.com/photo-1520250497591-112f2f40a3f4?q=80&w=1470&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D.jpg",
                             contentDescription = null,
                             modifier = Modifier
                                 .size(400.dp)


                         )
                         Spacer(modifier = Modifier.height(10.dp))

                         Row {


                             AsyncImage(
                                 model = "https://as1.ftcdn.net/v2/jpg/02/22/76/10/1000_F_222761055_jl4dpjCtMbtTocEjV1Im7YMCBE28il3H.jpg",
                                 contentDescription = null,
                                 modifier = Modifier
                                     .size(20.dp)





                             )




                             Text("Waiyaki Way")



                             Spacer(modifier = Modifier.width(10.dp))
                             AsyncImage(
                                 model = "https://cdn1.vectorstock.com/i/1000x1000/84/05/muffin-icon-vector-22868405.jpg",
                                 contentDescription = null,
                                 modifier = Modifier
                                     .size(20.dp)





                             )



                             Text("Italian")





                         }

                         Text(
                             "KEMPINSKI",
                             modifier = Modifier
                                 .size(500.dp),
                             fontWeight = FontWeight.Bold,


                             )










                     }







             }























































































         }
















































































































































    }














































































































