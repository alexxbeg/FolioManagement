package com.core.foliomanagement.dto.util;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@Builder(toBuilder = true)
@NoArgsConstructor
@Data
public class ResponseDto implements Serializable {
	private String mensage ;
}
