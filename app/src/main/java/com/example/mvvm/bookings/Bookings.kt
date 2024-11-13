package com.example.mvvm.Bookings

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
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
import com.example.mvvm.navigation.ROUTE_HOTEL

@Composable

fun bookings(navController: NavController){
    LazyColumn {
        item {
            Column {

                Spacer(modifier = Modifier.height(50.dp))



                Row(

                    modifier = Modifier
                        .fillMaxSize()
                        .fillMaxWidth()





                ) {


                Spacer(modifier = Modifier.width(200.dp))

                Text("+Create new account",

                    modifier = Modifier,
//                        .size(60.dp),,
                    fontWeight = FontWeight.Bold




                )}

                AsyncImage(
                    model = "https://img.freepik.com/free-vector/space-login-landing-page-template_23-2148260289.jpg",
                    contentDescription = null,
                    modifier = Modifier
                        .size(370.dp)



                )

                Column {

                    Text(
                        "Welcome back,",
                        modifier = Modifier,
                                style = TextStyle(fontSize = 30.sp)
                        ,
                        fontWeight = FontWeight.Bold

                    )

                    Text(
                        "Sign in to your",
                        modifier = Modifier,
                                style = TextStyle(fontSize = 30.sp),

                                fontWeight = FontWeight.Bold


                    )

                    Text(
                        "account",
                        modifier = Modifier,
//                        .size(100.dp),
                        style = TextStyle(fontSize = 30.sp),
                        fontWeight = FontWeight.Bold

                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text("Please enter your phone number",
                        modifier = Modifier


                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Row (Modifier.fillMaxSize()){





                        var text by remember { mutableStateOf(TextFieldValue("")) }
                        OutlinedTextField(
                            value = text,
                            leadingIcon = { Icon(imageVector = Icons.Default.Call, contentDescription = "callIcon") },



                            onValueChange = {
                                text = it
                            },
                            label = { Text(text = "Phone number") },
                            placeholder = { Text(text = "+2547 000 000 00") },
                        )
//
//                        Spacer(modifier = Modifier.width(50.dp))
//                        AsyncImage(
//                            model = "https://www.exitsignwarehouse.com/cdn/shop/products/ARROW_Sign_grande.png",
//                            contentDescription = null,
//                            modifier = Modifier
//                                .size(100.dp)
//                                .clip(CircleShape)
////                            .border(2.dp, Color.Black, CircleShape)
//                                .background(color = Color.White)
////                            .clickable { navController.navigate(ROUTE_BUY) }
//
//
//
//                        )







                    }

                    Spacer(modifier = Modifier.height(10.dp))


                    Column (modifier = Modifier
                        .fillMaxSize()
                        .fillMaxWidth()
                        .fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally


                    ){

                        Text("OR",
                            modifier = Modifier,
                            style = TextStyle(fontSize = 10.sp),
                            fontWeight = FontWeight.Bold




                        )
                    }

                    Row {


                        Button(onClick = {}, shape = RoundedCornerShape(20.dp),
                            modifier = Modifier
                                .width(500.dp),
                            colors = ButtonDefaults.outlinedButtonColors(

                                containerColor = Color.Blue,
                                contentColor = Color.White)
                        ){
                            Text(text = "Sign in with Meta")
                        }
                    }

                    Row (modifier = Modifier
                        .fillMaxSize()
                        .fillMaxWidth()


                    ){

                        Button(onClick = {}, shape = RoundedCornerShape(100.dp),
                            modifier = Modifier
                                .width(500.dp),
                            colors = ButtonDefaults.outlinedButtonColors(

                                containerColor = Color.Red,
                                contentColor = Color.White

                            )



                            ) {
                            Text(text = "Sign in with Google")
//
//                            Icon(
//                                imageVector = Icons.Filled.ArrowForward
//                            )




                        }
                    }

                    }







                    }


















                }






























            }

































        }













































































