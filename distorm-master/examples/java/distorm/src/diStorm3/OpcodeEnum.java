package diStorm3;

public enum OpcodeEnum {
	UNDEFINED, SLDT, POPA, UNPCKHPS, POPF, CMPLTSS, VMOVSD, PFPNACC, VMOVMSKPD,
	INVLPGA, UNPCKHPD, SYSEXIT, PFSUB, CMPLTSD, VPMULHUW, VPHSUBSW, VCMPNGEPS,
	VMOVSS, ARPL, FICOMP, RETF, FCHS, CMPLEPS, PUNPCKHDQ, VAESDEC, FUCOM, VCMPORDPS,
	PSUBUSW, PXOR, VPABSB, WRMSR, VCMPEQ_UQPS, VFMADDSUB231PD, PFMAX, VCMPNEQ_OSSS,
	VFNMADD213PD, MOVNTI, PFCMPGT, VFNMADD231SS, ROUNDPD, VCMPGTPS, VRCPSS, VFNMADD132SS,
	VCMPNGEPD, VFMSUB213PD, VCMPNEQ_OSSD, VPSLLDQ, PFCMPGE, VCMPGTPD, CVTDQ2PD,
	CMPLESD, JNS, VDIVSD, JNP, EXTRACTPS, PMOVZXBQ, JNZ, FCOMI, VPUNPCKHWD, PMOVZXBD,
	VMOVNTDQ, PMOVSXWD, POPCNT, JNO, FNSAVE, LOOP, VMOVMSKPS, FLDL2T, CMPS, FSUB,
	DIVPS, PHSUBD, CMPEQSS, CMC, CVTTPS2DQ, DIVPD, VMOVD, CALL_FAR, PMULHRSW, VPMULHRSW,
	PHSUBW, CMPEQSD, XADD, CMOVBE, CMP, SBB, VHADDPS, FXRSTOR64, INVVPID, LSL,
	VCMPNEQ_USSS, VHADDPD, LSS, VFMSUB132PD, LAHF, PFACC, PFRCPIT2, VPUNPCKLBW,
	PFRCPIT1, PCMPGTQ, FYL2X, VCMPORD_SSD, PSRLD, SFENCE, CVTPS2DQ, PBLENDW, VFMSUBADD213PS,
	VPINSRB, PCMPGTB, PCMPGTD, VAESENC, VMOVSHDUP, MPSADBW, VCMPNLE_UQPD, VMMCALL,
	INSERTQ, VFNMADD213SS, CVTPI2PD, INT, VPERMILPS, HLT, PHMINPOSUW, FCMOVNU,
	INVPCID, INS, FCOMIP, CVTPI2PS, VFNMADD213SD, PACKUSWB, CBW, VMSAVE, PUSHF,
	NOT, FCMOVNB, NOP, FSQRT, VPERMILPD, INC, UD2, VPCMPEQW, PCMPISTRM, VPCMPEQQ,
	CMPNLEPS, VCMPEQ_USSD, VCMPUNORDPD, FADDP, RET, VPCMPEQD, VPMINSD, VPCMPEQB,
	ADDSUBPD, VFMADDSUB231PS, VCMPEQ_USSS, PSIGNW, VPMOVSXDQ, VPMAXSD, SETG, VPMAXSB,
	SETA, SETB, STMXCSR, SETL, MOVNTQ, SETO, ANDNPD, BSR, VMOVDDUP, VPMAXSW, PSIGND,
	SETP, PSIGNB, LFS, SETS, VCMPUNORDSS, ANDNPS, VMXON, VANDPS, XSETBV, OUT, LTR,
	VPINSRD, TZCNT, VCVTTSS2SI, VPSRLDQ, FDECSTP, PSRLDQ, VCMPGE_OQSD, PSLLDQ,
	FCOS, FXTRACT, VCMPGE_OQSS, VMOVNTDQA, VCMPNGT_UQPD, FMUL, VCMPGT_OQPS, FCOMPP,
	PF2ID, CWD, VCMPUNORD_SPS, CMOVLE, VPSHUFHW, VCMPGT_OQPD, PHADDSW, PF2IW, VMOVNTPD,
	FCOMP, UNPCKLPS, MASKMOVDQU, FCMOVBE, VCMPLT_OQPD, VMAXSD, VCMPNLTPD, PREFETCHT2,
	PREFETCHT1, PREFETCHT0, UNPCKLPD, CVTTSS2SI, DIV, PMOVSXDQ, VCMPGESS, CDQE,
	VSTMXCSR, FISUBR, VPMINSB, VFMSUB213PS, VCMPLT_OQPS, CMPLESS, VPMINSW, FSTENV,
	VCMPGESD, VPTEST, FISUB, STD, VPACKSSDW, XOR, VMULPD, STC, STI, LDMXCSR, CMPLTPD,
	ORPS, VPACKUSDW, FSUBP, STR, FSUBR, CMPLTPS, VFMADD231SD, PAUSE, CVTPD2DQ,
	RSM, VSQRTSD, VORPS, VFMADDSUB213PS, AESENC, VCMPEQ_UQPD, VUNPCKHPS, PMADDUBSW,
	VCMPNLE_UQPS, VPSLLW, MASKMOVQ, CALL, VSQRTSS, PADDUSB, VMREAD, XSAVEOPT64,
	VUNPCKHPD, VSUBPS, VCVTSS2SD, VAESDECLAST, HSUBPS, VCVTSS2SI, VPBLENDVB, VCMPGTSD,
	FILD, VCOMISS, HSUBPD, VFNMSUB231SS, VPSRAD, VCMPNLEPS, SAL, SYSCALL, VRSQRTSS,
	VPINSRQ, WRGSBASE, VPSHUFD, PMOVSXBW, VPSRAW, VCMPNLEPD, FADD, SAR, XEND, AESKEYGENASSIST,
	PACKSSDW, VFMADD213SS, VMOVDQA, VMOVSLDUP, FRNDINT, PMULLW, DIVSD, MOVMSKPS,
	VPMAXUW, VDIVPD, VPMOVSXBW, PMOVSXWQ, PMULLD, VMOVDQU, VFNMSUB213SD, CMOVAE,
	VCMPEQ_OSPD, VDIVPS, JAE, MOVMSKPD, DIVSS, FSAVE, PCMPEQQ, VPSHUFLW, PCMPEQW,
	VLDMXCSR, VFMSUB132SS, CMPORDPD, RCPSS, VPSLLD, IDIV, VCMPORDPD, PCMPEQB, PCMPEQD,
	VPSLLQ, VPMOVZXBQ, VFMSUBADD213PD, VBLENDVPD, CMPORDPS, PUNPCKLQDQ, VPAND,
	VCMPNEQ_OQPD, HADDPD, VADDSUBPS, VSHUFPD, VSUBSD, VSQRTPS, MOVSHDUP, VFNMADD231SD,
	VMLAUNCH, VMASKMOVPD, HADDPS, VCMPNEQ_OQPS, PUNPCKLWD, VCMPNGT_UQSS, VSQRTPD,
	VSUBSS, VSHUFPS, VCMPNEQSS, VLDDQU, VCMPLT_OQSS, RDRAND, PADDSW, VCMPEQ_USPS,
	ORPD, PANDN, FPTAN, FIDIV, VCMPLT_OQSD, VMPTRLD, VFMSUB231PS, VCMPNEQSD, VPMULDQ,
	LOOPNZ, VCMPUNORDPS, SHR, SHRD, MONITOR, XABORT, AESENCLAST, MOVSD, VPINSRW,
	VMLOAD, MOVLHPS, VMOVLPD, MOVQ2DQ, SQRTSS, VDPPS, SUBSS, MOVSX, VMOVLHPS, VMOVLPS,
	VPUNPCKHDQ, VCVTPD2DQ, SHL, MOVSS, PINSRQ, PFNACC, MOVDQU, OUTS, PSUBB, BTS,
	BTR, VCMPNEQ_USSD, SGDT, VFMADD231SS, FSCALE, PSUBW, CMPNLTPD, PACKUSDW, LAR,
	BTC, VFNMADD132SD, VCMPNGTPD, VPMOVZXBW, VFMSUB132SD, AESIMC, FCOM, VPMOVZXBD,
	VADDSUBPD, FINIT, CMPORDSS, WBINVD, PAND, VPALIGNR, CMPORDSD, VPXOR, JBE, FXAM,
	XSAVEOPT, MUL, VPMINUB, VPADDSW, PMAXSW, VINSERTPS, VCMPEQPD, FFREE, VMASKMOVPS,
	CMPXCHG8B, PMAXSD, VPADDSB, PUSH, VPCLMULQDQ, VCMPEQPS, PFRSQIT1, ROUNDPS,
	SETNO, XGETBV, PMINSD, PADDB, FPREM1, CLD, FIMUL, XORPD, CLC, FSTP, BLENDPD,
	PADDUSW, FNINIT, SETNZ, PADDQ, XORPS, VFNMSUB213SS, SETNS, FIADD, SETNP, VPUNPCKHQDQ,
	SUBPS, CMPNLTSD, LLDT, VFMSUB213SD, PTEST, VFNMSUB132PD, GETSEC, VPSIGND, JCXZ,
	CMPNLTSS, SETGE, CMPEQPS, PSADBW, MOVSXD, VFNMSUB132PS, AAD, VAESENCLAST, PUNPCKHQDQ,
	MOVLPD, VPADDUSW, VCMPFALSEPS, AAM, VPUNPCKLQDQ, MINSS, PADDD, VCMPFALSEPD,
	VPUNPCKLWD, MOVLPS, CLGI, AAS, LODS, CMOVNP, MINSD, CLI, CVTTSD2SI, FICOM,
	PMOVZXBW, ADDPD, PREFETCHW, VCMPNEQ_USPS, VXORPD, POR, POP, VPERM2F128, LOOPZ,
	MOVNTDQ, INT1, CMPXCHG, VBROADCASTF128, VCMPNGE_UQPD, PHADDW, VXORPS, VCMPNEQ_USPD,
	ADDPS, PFMUL, LGDT, VERR, VERW, VHSUBPD, VPMULLW, VMOVUPS, INTO, FCLEX, VHSUBPS,
	CVTSD2SS, FLDPI, PABSW, VMAXPD, JMP_FAR, VPACKUSWB, FUCOMPP, VMOVUPD, PSWAPD,
	VROUNDSD, PADDW, PSLLD, SWAPGS, MOVSLDUP, CVTSI2SS, VCMPTRUESD, CMPUNORDSS,
	VCVTTPS2DQ, SQRTSD, VBROADCASTSD, PSUBD, TEST, LGS, VCMPTRUESS, SYSENTER, CVTSI2SD,
	VCMPNLESD, VTESTPD, JZ, VDIVSS, VORPD, JP, JS, JL, RSQRTSS, VTESTPS, JO, VMAXPS,
	PSUBUSB, JG, VBROADCASTSS, JA, JB, CWDE, VCMPLEPD, VMWRITE, VCMPLEPS, PMOVMSKB,
	INSERTPS, PCMPESTRI, WAIT, VCMPFALSE_OSPD, PCMPESTRM, PUNPCKLDQ, MULSS, VSUBPD,
	CMPEQPD, VCMPNEQ_OQSD, VCOMISD, VMINSS, VPADDD, RDMSR, VPSIGNW, JECXZ, MULSD,
	ENTER, MOVBE, VZEROALL, _3DNOW, VMINSD, VCMPNEQ_OQSS, PFSUBR, VCMPGEPS, VPSUBUSB,
	VFMSUB231SD, PMAXUD, FXSAVE, FISTTP, VCMPGEPD, BLENDPS, VCMPLESD, FCMOVNBE,
	VFMSUB231SS, VBLENDVPS, VMPSADBW, VPSUBUSW, VCMPLTSD, MOVNTDQA, SHUFPD, SUBPD,
	SQRTPD, VMOVHPD, VMCALL, VFMADD132PD, LEAVE, SHUFPS, VCMPEQ_OSPS, VPCMPESTRI,
	VCMPLTSS, VPCMPESTRM, VFMADD132PS, LIDT, F2XM1, VMOVHPS, PMOVZXDQ, VZEROUPPER,
	SQRTPS, VANDNPS, VPADDQ, FPREM, VPADDW, PALIGNR, PMINSB, PCMPGTW, SHLD, LDS,
	VPADDB, VMRUN, RDFSBASE, VANDNPD, XLAT, XCHG, FINCSTP, MOVDQ2Q, PMINSW, SMSW,
	VPSIGNB, XRSTOR, VBLENDPD, JGE, VCMPNLT_UQPS, VCMPORDSD, VBLENDPS, FTST, CVTTPD2DQ,
	VCMPORDSS, VCMPNLT_UQPD, VFNMSUB132SS, XRSTOR64, AND, VRSQRTPS, CLFLUSH, PSHUFB,
	FLDENV, MOV, PSHUFD, JLE, FEDISI, VMFUNC, VPCMPGTW, PFCMPEQ, VCMPORD_SSS, PSHUFW,
	VPEXTRB, VCVTDQ2PD, VMOVQ, FLDL2E, VPEXTRD, VPHSUBW, VFNMSUB213PS, VFMADD213PD,
	STGI, FPATAN, VPEXTRQ, FST, INT_3, FIST, VMCLEAR, PMOVSXBQ, AAA, VPHSUBD, CVTTPS2PI,
	CMPNEQPS, VCMPGE_OQPD, LDDQU, RSQRTPS, VADDPD, PFRCP, CVTSS2SD, VFNMSUB132SD,
	FDIVRP, FBLD, CPUID, RDTSC, VPBLENDW, VCVTPS2DQ, VPOR, VADDPS, PI2FW, MINPS,
	VCMPEQ_OSSD, VPMULUDQ, MAXSD, VPMULLD, FIDIVR, VUCOMISS, MOVDDUP, VPSHUFB,
	PHSUBSW, VPCMPISTRI, MAXSS, VPAVGB, VCMPFALSE_OSSS, MINPD, FYL2XP1, VUCOMISD,
	VFNMSUB231PD, VCMPNGE_UQSD, ADDSD, VMXOFF, PSRLQ, VCMPNEQPS, PSRLW, PSRAD,
	SIDT, PACKSSWB, XSAVE, VCMPNEQPD, CDQ, ADDSS, VCMPNGE_UQSS, CRC32, VAESIMC,
	PMAXSB, VEXTRACTPS, VCMPNLT_UQSD, VPSUBB, VPMOVZXWQ, VCMPNEQ_OSPS, MOVNTSS,
	VEXTRACTF128, PADDSB, IMUL, RCR, VCMPUNORD_SPD, RCL, MOVNTSD, VCMPNEQ_OSPD,
	VCMPNLT_UQSS, SUBSD, SCAS, PCLMULQDQ, PFRSQRT, PINSRD, FSUBRP, PUSHA, VPMAXUB,
	CMPUNORDPS, VPMAXUD, FABS, VPMOVSXBQ, VCMPTRUEPD, FEMMS, VCMPEQ_OSSS, VFMADD213SD,
	VPMOVSXBD, CMPUNORDPD, VMPTRST, CMPXCHG16B, VCMPTRUEPS, VCMPNGTPS, FNCLEX,
	CMPNEQSD, VCMPEQ_UQSD, FCMOVU, EXTRQ, DPPD, CMOVGE, PINSRB, VCMPEQ_UQSS, VPMADDUBSW,
	CMPNEQSS, VFMADD231PD, FSIN, IN, FCMOVE, FLDCW, DPPS, FCMOVB, VPSRLW, LFENCE,
	CVTSD2SI, SETAE, CMOVNZ, VPSRLQ, FMULP, VMOVAPD, VCMPLE_OQSS, CMOVNS, FCMOVNE,
	CMOVNO, VPMULHW, VPSRLD, CVTPS2PH, CVTPS2PI, PHADDD, CVTPS2PD, VPABSW, VCMPLE_OQSD,
	VMOVAPS, VPSUBW, PMULHRW, MOVAPS, PFMIN, MOVD, MOVHPS, MULPS, VCMPLTPS, BT,
	MOVAPD, VCMPNGE_UQPS, JRCXZ, MULPD, MOVS, INVLPG, MOVQ, VMINPD, PABSD, SAHF,
	VCMPTRUE_USPS, PI2FD, PABSB, VPANDN, VPUNPCKLDQ, FDIVP, PSUBQ, FDIVR, FDIV,
	VCMPTRUE_USPD, PREFETCH, EMMS, VMINPS, VFMADD231PS, VFNMSUB213PD, CVTSS2SI,
	MOVHPD, CMOVZ, VPAVGW, CQO, VPSUBD, CMOVP, VCMPEQSS, CMOVS, PMOVSXBD, VROUNDSS,
	VPSUBQ, CMOVL, ADDSUBPS, CMOVO, CMOVA, CMOVB, PUNPCKHBW, PCMPISTRI, CMOVG,
	VPMOVMSKB, AESDECLAST, MOVUPD, VFMSUBADD132PD, VPSADBW, XBEGIN, VROUNDPD, LMSW,
	INVEPT, MOVZX, ANDPS, VFMSUBADD132PS, MOVUPS, VCMPGTSS, PMULHUW, VDPPD, PEXTRD,
	VCMPFALSESS, RDGSBASE, OR, VPEXTRW, VPSUBSB, FXRSTOR, CLTS, VCMPNGT_UQSD, VCMPNGTSS,
	FRSTOR, VCMPFALSESD, FLDLN2, VINSERTF128, VPSUBSW, PMULUDQ, DEC, VCMPFALSE_OSPS,
	FLD, VPMOVZXDQ, ROUNDSS, VCVTSI2SS, PEXTRW, FXSAVE64, ROL, VFMADD132SD, CMPLEPD,
	VCVTSD2SS, FUCOMP, JMP, VCMPEQSD, CVTDQ2PS, VCMPGT_OQSS, FUCOMI, LZCNT, VRCPPS,
	PMAXUB, VPHADDD, VCVTSI2SD, VCMPGT_OQSD, ROR, INVD, VCVTSD2SI, AESDEC, CMPNLESD,
	SETLE, VFMSUBADD231PS, VFNMADD231PS, XSAVE64, PUNPCKHWD, VPMOVSXWD, CVTPD2PS,
	VMOVHLPS, VFMSUBADD231PD, CVTPD2PI, CMPNLESS, PMULDQ, VPMOVSXWQ, VCMPNLTSD,
	VFMSUB132PS, VFNMADD231PD, FSTSW, RDTSCP, MFENCE, VFMADD132SS, PMINUD, FENI,
	BOUND, VROUNDPS, PSHUFLW, VMULSS, VCMPFALSE_OSSD, VCVTDQ2PS, VCMPLESS, FNOP,
	CMPNLTPS, VCMPNLTPS, FLDLG2, SYSRET, FSTCW, VFMSUB213SS, SKINIT, VANDPD, FLDZ,
	SUB, VPHADDW, NEG, PMINUW, MAXPD, VCMPORD_SPS, STOS, VFNMSUB231SD, VCMPUNORDSD,
	PAVGUSB, VCMPORD_SPD, MAXPS, PMINUB, VMASKMOVDQU, FBSTP, PINSRW, VPMOVZXWD,
	VPMINUW, VCMPNLE_UQSD, SALC, PEXTRB, VUNPCKLPS, VCMPNLE_UQSS, MOVDQA, VCMPNLTSS,
	PSLLQ, VMOVNTPS, VPMINUD, PREFETCHNTA, VUNPCKLPD, CVTPH2PS, VAESKEYGENASSIST,
	PSUBSW, VCMPNGESD, FNSTENV, FNSTSW, CMPNEQPD, PAVGW, MOVNTPD, VCMPEQ_USPD,
	FSETPM, BLENDVPS, VFMADDSUB213PD, ADD, VCMPNGESS, ADC, PSUBSB, BLENDVPD, VPUNPCKHBW,
	RDPMC, MOVNTPS, BSF, VCMPLTPD, PAVGB, LEA, VCVTTPD2DQ, VPCMPGTB, VPCMPGTD,
	FLD1, VPMADDWD, VCMPUNORD_SSD, LES, SETZ, VPCMPGTQ, VMULSD, VFMADD213PS, VCMPNLESS,
	MOVHLPS, VPHMINPOSUW, VPABSD, PSRAW, PFADD, VFMADDSUB132PD, COMISD, VCMPGE_OQPS,
	VMAXSS, CMPUNORDSD, FSINCOS, COMISS, VFMADDSUB132PS, RCPPS, VFNMADD132PD, FXCH,
	DAA, SETBE, VCVTPS2PD, PMADDWD, ANDPD, VCMPLE_OQPS, VCMPNGTSD, VFNMSUB231PS,
	FUCOMIP, VMULPS, VFNMADD132PS, WRFSBASE, DAS, VCMPLE_OQPD, IRET, BSWAP, PUNPCKLBW,
	PMAXUW, VPCMPISTRM, PSLLW, VCMPUNORD_SSS, VFNMADD213PS, VCVTTSD2SI, VFMSUB231PD,
	VCMPNGT_UQPS, FNSTCW, ROUNDSD, CMPNLEPD, PEXTRQ, PMULHW, VPHADDSW, FISTP, PMOVZXWQ,
	VCVTPD2PS, VCMPTRUE_USSS, VADDSD, PBLENDVB, VMRESUME, UCOMISD, PMOVZXWD, CVTTPD2PI,
	UCOMISS, VPACKSSWB, VADDSS, PSHUFHW, VCMPTRUE_USSD, MWAIT
}