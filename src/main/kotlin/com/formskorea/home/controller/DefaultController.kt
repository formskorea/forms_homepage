package com.formskorea.home.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@Controller
@RequestMapping(value = ["/"])
class DefaultController {

    @RequestMapping(value = ["/"], method = [RequestMethod.GET, RequestMethod.POST])
    @Throws(Exception::class)
    fun main(model: Model, response: HttpServletResponse, request: HttpServletRequest) : Any {
        return "index"
    }
}