package com.example.characterdetails




import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

val Typography = Typography(
    displayLarge = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 34.sp,
        letterSpacing = 0.25.sp
    ),
    displayMedium = TextStyle(
   
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp,
        letterSpacing = 0.15.sp
    ),
    displaySmall = TextStyle(
   
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp,
        letterSpacing = 0.15.sp
    ),
    bodyLarge = TextStyle(
   
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        letterSpacing = 0.5.sp
    ),
    bodyMedium = TextStyle(
   
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        letterSpacing = 0.25.sp
    ),
    bodySmall = TextStyle(
   
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        letterSpacing = 0.4.sp
    )
)
