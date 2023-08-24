package com.demo.service;

import org.springframework.stereotype.Service;

import com.demo.entity.Person;
import com.demo.exception.InvalidVoterException;

@Service
public class VoterService {

	public String doVote(Person person) {

		String res = null;

		if (isValidVoter(person))
			res = person.getName() + "is valid to Vote !!";

		else
			res = "not allowed to vote !!";

		return res;

	}

	private boolean isValidVoter(Person person) {

		boolean result = false;

		if (person.getAge() >= 18) {

			if (person.getCountry().equalsIgnoreCase("INDIA"))

				result = true;

			else

				throw new InvalidVoterException("country is not valid");

		} else
			throw new InvalidVoterException("age is not valid");

		return result;

	}

}
