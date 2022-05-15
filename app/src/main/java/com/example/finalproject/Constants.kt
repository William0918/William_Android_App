package com.example.finalproject

object AnimalConstants{

    const val TOTAL_QUESTIONS:String = "total_question"
    const val CORRECT_ANSWERS:String = "correct_answers"

    fun getAnimalQuestions(): ArrayList<Question>{
        val animalQuestionsList = ArrayList<Question>()
        val que1 = Question(1,"What animal is this?",
            R.drawable.animalpig, "Pig","Cow",
            "Bird","Cat", 1
        )

        animalQuestionsList.add(que1)

        val que2 = Question(2,"What animal is this?",
            R.drawable.animalhorse, "Dog","Cow",
            "Bunny","Horse", 4
        )

        animalQuestionsList.add(que2)
        val que3 = Question(3,"What animal is this?",
            R.drawable.animaldog, "Cat","Dog",
            "Bird","Bunny", 2
        )

        animalQuestionsList.add(que3)
        val que4 = Question(4,"What animal is this?",
            R.drawable.animalcow, "Pig","Cow",
            "Bird","Horse", 2
        )

        animalQuestionsList.add(que4)
        val que5 = Question(5,"What animal is this?",
            R.drawable.animalcat, "Pig","Dog",
            "Bird","Cat", 4
        )

        animalQuestionsList.add(que5)
        val que6 = Question(6,"What animal is this?",
            R.drawable.animalbunny, "Dog","Sheep",
            "Bunny","Bird", 3
        )

        animalQuestionsList.add(que6)
        val que7 = Question(7,"What animal is this?",
            R.drawable.animalbird, "Pig","Cow",
            "Bird","Cat", 3
        )

        animalQuestionsList.add(que7)

        return animalQuestionsList

    }
}
object ColorConstants{

    const val TOTAL_QUESTIONS:String = "total_question"
    const val CORRECT_ANSWERS:String = "correct_answers"

    fun getColorQuestions(): ArrayList<Question>{
        val colorQuestionsList = ArrayList<Question>()
        val que1 = Question(1,"What color is this?",
            R.drawable.colorblack, "Black","Red",
            "White","Purple", 1
        )

        colorQuestionsList.add(que1)

        val que2 = Question(2,"What color is this?",
            R.drawable.colorblue, "Black","White",
            "Green","Blue", 4
        )

        colorQuestionsList.add(que2)
        val que3 = Question(3,"What color is this?",
            R.drawable.colorgreen, "Orange","Green",
            "Blue","Yellow", 2
        )

        colorQuestionsList.add(que3)
        val que4 = Question(4,"What color is this?",
            R.drawable.colororange, "Yellow","Orange",
            "Purple","Red", 2
        )

        colorQuestionsList.add(que4)
        val que5 = Question(5,"What color is this?",
            R.drawable.colorpurple, "Black","Blue",
            "Green","Purple", 4
        )

        colorQuestionsList.add(que5)
        val que6 = Question(6,"What color is this?",
            R.drawable.colorred, "White","Orange",
            "Red","Yellow", 3
        )

        colorQuestionsList.add(que6)
        val que7 = Question(7,"What color is this?",
            R.drawable.coloryellow, "White","Blue",
            "Yellow","Orange", 3
        )

        colorQuestionsList.add(que7)
        val que8 = Question(8,"What color is this?",
            R.drawable.colorwhite, "Black","Blue",
            "White","Orange", 3
        )

        colorQuestionsList.add(que8)

        return colorQuestionsList

    }
}
object NumberConstants{

    const val TOTAL_QUESTIONS:String = "total_question"
    const val CORRECT_ANSWERS:String = "correct_answers"

    fun getNumberQuestions(): ArrayList<Question>{
        val numberQuestionsList = ArrayList<Question>()
        val que1 = Question(1,"What number is this?",
            R.drawable.number0, "Zero","Two",
            "Four","Seven", 1
        )

        numberQuestionsList.add(que1)

        val que2 = Question(2,"What number is this?",
            R.drawable.number1, "Six","Zero",
            "Five","One", 4
        )

        numberQuestionsList.add(que2)
        val que3 = Question(3,"What number is this?",
            R.drawable.number2, "Five","Two",
            "Six","Zero", 2
        )

        numberQuestionsList.add(que3)
        val que4 = Question(4,"What number is this?",
            R.drawable.number3, "Zero","Three",
            "Eight","Six", 2
        )

        numberQuestionsList.add(que4)
        val que5 = Question(5,"What number is this?",
            R.drawable.number4, "Six","Three",
            "Nine","Four", 4
        )

        numberQuestionsList.add(que5)
        val que6 = Question(6,"What number is this?",
            R.drawable.number5, "Nine","One",
            "Five","Three", 3
        )

        numberQuestionsList.add(que6)
        val que7 = Question(7,"What number is this?",
            R.drawable.number6, "Three","Two",
            "Six","Zero", 3
        )

        numberQuestionsList.add(que7)
        val que8 = Question(8,"What number is this?",
            R.drawable.number7, "Six","Three",
            "Nine","Seven", 4
        )

        numberQuestionsList.add(que8)
        val que9 = Question(9,"What number is this?",
            R.drawable.number8, "Eight","One",
            "Five","Three", 1
        )

        numberQuestionsList.add(que9)
        val que10 = Question(10,"What number is this?",
            R.drawable.number9, "Three","Nine",
            "Six","Zero", 2
        )

        numberQuestionsList.add(que10)

        return numberQuestionsList

    }
}
object ShapeConstants{

    const val TOTAL_QUESTIONS:String = "total_question"
    const val CORRECT_ANSWERS:String = "correct_answers"

    fun getShapeQuestions(): ArrayList<Question>{
        val shapeQuestionsList = ArrayList<Question>()
        val que1 = Question(1,"What shape is this?",
            R.drawable.shapecircle, "Circle","Heart",
            "Square","Oval", 1
        )

        shapeQuestionsList.add(que1)

        val que2 = Question(2,"What shape is this?",
            R.drawable.shapediamond, "Heart","Triangle",
            "Circle","Diamond", 4
        )

        shapeQuestionsList.add(que2)
        val que3 = Question(3,"What shape is this?",
            R.drawable.shapeheart, "Rectangle","Heart",
            "Diamond","Triangle", 2
        )

        shapeQuestionsList.add(que3)
        val que4 = Question(4,"What shape is this?",
            R.drawable.shapeoval, "Square","Oval",
            "Star","Triangle", 2
        )

        shapeQuestionsList.add(que4)
        val que5 = Question(5,"What shape is this?",
            R.drawable.shaperectangle, "Star","Circle",
            "Oval","Rectangle", 4
        )

        shapeQuestionsList.add(que5)
        val que6 = Question(6,"What shape is this?",
            R.drawable.shapesquare, "Heart","Diamond",
            "Square","Oval", 3
        )

        shapeQuestionsList.add(que6)
        val que7 = Question(7,"What shape is this?",
            R.drawable.shapestar, "Rectangle","Heart",
            "Star","Triangle", 3
        )

        shapeQuestionsList.add(que7)
        val que8 = Question(8,"What shape is this?",
            R.drawable.shapetriangle, "Triangle","Square",
            "Oval","Circle", 1
        )

        shapeQuestionsList.add(que8)

        return shapeQuestionsList

    }
}
object VehicleConstants{

    const val TOTAL_QUESTIONS:String = "total_question"
    const val CORRECT_ANSWERS:String = "correct_answers"


    fun getVehicleQuestions(): ArrayList<Question>{
        val vehicleQuestionsList = ArrayList<Question>()
        val que1 = Question(1,"What vehicle is this?",
            R.drawable.vehiclebike, "Bike","Car",
            "Boat","Plane", 1
        )

        vehicleQuestionsList.add(que1)

        val que2 = Question(2,"What vehicle is this?",
            R.drawable.vehicleboat, "Bike","Plane",
            "Truck","Boat", 4
        )

        vehicleQuestionsList.add(que2)
        val que3 = Question(3,"What vehicle is this?",
            R.drawable.vehiclecar, "Truck","Car",
            "Bike","Plane", 2
        )

        vehicleQuestionsList.add(que3)
        val que4 = Question(4,"What vehicle is this?",
            R.drawable.vehicleplane, "Car","Plane",
            "Truck","Boat", 2
        )

        vehicleQuestionsList.add(que4)
        val que5 = Question(5,"What vehicle is this?",
            R.drawable.vehicletruck, "Bike","Boat",
            "Plane","Truck", 4
        )

        vehicleQuestionsList.add(que5)


        return vehicleQuestionsList

    }
}
