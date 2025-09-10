package defpackage;

import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class fmz implements pdm {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ fmz(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.pdm
    public final /* synthetic */ String a() {
        return "";
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, peo] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, pau] */
    @Override // defpackage.pdm
    public final void d(phc phcVar) {
        switch (this.c) {
            case 0:
                pdk pdkVarA = phcVar.a();
                Object obj = this.a;
                if (pdkVarA != null) {
                    ojl.bw(pdkVarA, new as(obj, pdkVarA, this.b, 17, (short[]) null));
                }
                fna fnaVar = (fna) obj;
                fnaVar.a(scn.F((sbp) ezh.k(new foq(fnaVar.i, 19))));
                break;
            case 1:
                pdk pdkVarA2 = phcVar.a();
                if (pdkVarA2 != null) {
                    ojl.bw(pdkVarA2, new as(pdkVarA2, this.b, this.a, 14));
                    break;
                }
                break;
            case 2:
                final ?? r0 = this.b;
                final gcm gcmVar = (gcm) this.a;
                ojl.bB(phcVar, new pec() { // from class: gcg
                    /* JADX WARN: Removed duplicated region for block: B:79:0x0222 A[Catch: all -> 0x0243, TryCatch #0 {, blocks: (B:39:0x00da, B:41:0x00e0, B:43:0x00ea, B:45:0x00f2, B:48:0x0100, B:50:0x0108, B:53:0x0118, B:55:0x0129, B:58:0x0133, B:62:0x017c, B:64:0x0193, B:65:0x0198, B:67:0x019c, B:69:0x01c8, B:71:0x01d7, B:72:0x01e8, B:79:0x0222, B:73:0x01f3, B:75:0x01fb, B:77:0x0207, B:81:0x023d, B:82:0x023e, B:83:0x0241), top: B:95:0x00da, outer: #1 }] */
                    /* JADX WARN: Type inference failed for: r5v21, types: [java.lang.Object, mcq] */
                    /* JADX WARN: Type inference failed for: r5v32, types: [java.lang.Object, mcq] */
                    @Override // defpackage.pec
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void a(defpackage.pdk r23) {
                        /*
                            Method dump skipped, instructions count: 609
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.gcg.a(pdk):void");
                    }
                });
                break;
            case 3:
                final Object obj2 = this.b;
                final Object obj3 = this.a;
                final int i = 1;
                ojl.bB(phcVar, new pec() { // from class: gkp
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, peo] */
                    @Override // defpackage.pec
                    public final void a(pdk pdkVar) {
                        int i2 = i;
                        if (i2 == 0) {
                            Object obj4 = obj3;
                            Object obj5 = ((gkq) obj4).b;
                            Object obj6 = obj2;
                            synchronized (obj5) {
                                ExecutorService executorService = ((gkq) obj4).c;
                                if (executorService == null) {
                                    return;
                                }
                                executorService.execute(new gdq(obj4, (Object) pdkVar, obj6, 2, (byte[]) null));
                                return;
                            }
                        }
                        if (i2 == 1) {
                            Object obj7 = obj3;
                            Object obj8 = ((gcm) obj7).c;
                            ?? r8 = obj2;
                            synchronized (obj8) {
                                poj pojVarE = pdkVar.e(r8);
                                if (pojVarE != null) {
                                    ((mlw) ((gcm) obj7).g.c()).f(pojVarE);
                                }
                                pdkVar.close();
                            }
                            return;
                        }
                        Object obj9 = obj3;
                        try {
                            poe poeVarD = pdkVar.d();
                            if (poeVarD == null) {
                                ((sgt) kya.a.b().M(3652)).s("Error retrieving metadata, ignoring frame");
                            } else {
                                ((kya) obj9).c.a(poeVarD);
                                nkw nkwVar = nkw.COTTAGE;
                                Object obj10 = obj2;
                                if (obj10 != nkwVar && obj10 != nkw.SERENGETI) {
                                    ((kya) obj9).b.a(poeVarD);
                                }
                            }
                            pdkVar.close();
                        } finally {
                        }
                    }
                });
                break;
            case 4:
                final Object obj4 = this.b;
                final Object obj5 = this.a;
                final int i2 = 0;
                ojl.bB(phcVar, new pec() { // from class: gkp
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, peo] */
                    @Override // defpackage.pec
                    public final void a(pdk pdkVar) {
                        int i22 = i2;
                        if (i22 == 0) {
                            Object obj42 = obj5;
                            Object obj52 = ((gkq) obj42).b;
                            Object obj6 = obj4;
                            synchronized (obj52) {
                                ExecutorService executorService = ((gkq) obj42).c;
                                if (executorService == null) {
                                    return;
                                }
                                executorService.execute(new gdq(obj42, (Object) pdkVar, obj6, 2, (byte[]) null));
                                return;
                            }
                        }
                        if (i22 == 1) {
                            Object obj7 = obj5;
                            Object obj8 = ((gcm) obj7).c;
                            ?? r8 = obj4;
                            synchronized (obj8) {
                                poj pojVarE = pdkVar.e(r8);
                                if (pojVarE != null) {
                                    ((mlw) ((gcm) obj7).g.c()).f(pojVarE);
                                }
                                pdkVar.close();
                            }
                            return;
                        }
                        Object obj9 = obj5;
                        try {
                            poe poeVarD = pdkVar.d();
                            if (poeVarD == null) {
                                ((sgt) kya.a.b().M(3652)).s("Error retrieving metadata, ignoring frame");
                            } else {
                                ((kya) obj9).c.a(poeVarD);
                                nkw nkwVar = nkw.COTTAGE;
                                Object obj10 = obj4;
                                if (obj10 != nkwVar && obj10 != nkw.SERENGETI) {
                                    ((kya) obj9).b.a(poeVarD);
                                }
                            }
                            pdkVar.close();
                        } finally {
                        }
                    }
                });
                break;
            case 5:
                pdk pdkVarA3 = phcVar.a();
                if (pdkVarA3 != null) {
                    pdkVarA3.j(new hsp(pdkVarA3, (htw) this.b, (htv) this.a));
                    break;
                }
                break;
            case 6:
                pdk pdkVarA4 = phcVar.a();
                if (pdkVarA4 != null) {
                    pdkVarA4.j(new iiy((ija) this.a, pdkVarA4, this.b));
                    break;
                }
                break;
            default:
                if (phcVar.b() != null) {
                    final Object obj6 = this.b;
                    final Object obj7 = this.a;
                    final int i3 = 2;
                    ojl.bB(phcVar, new pec() { // from class: gkp
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, peo] */
                        @Override // defpackage.pec
                        public final void a(pdk pdkVar) {
                            int i22 = i3;
                            if (i22 == 0) {
                                Object obj42 = obj7;
                                Object obj52 = ((gkq) obj42).b;
                                Object obj62 = obj6;
                                synchronized (obj52) {
                                    ExecutorService executorService = ((gkq) obj42).c;
                                    if (executorService == null) {
                                        return;
                                    }
                                    executorService.execute(new gdq(obj42, (Object) pdkVar, obj62, 2, (byte[]) null));
                                    return;
                                }
                            }
                            if (i22 == 1) {
                                Object obj72 = obj7;
                                Object obj8 = ((gcm) obj72).c;
                                ?? r8 = obj6;
                                synchronized (obj8) {
                                    poj pojVarE = pdkVar.e(r8);
                                    if (pojVarE != null) {
                                        ((mlw) ((gcm) obj72).g.c()).f(pojVarE);
                                    }
                                    pdkVar.close();
                                }
                                return;
                            }
                            Object obj9 = obj7;
                            try {
                                poe poeVarD = pdkVar.d();
                                if (poeVarD == null) {
                                    ((sgt) kya.a.b().M(3652)).s("Error retrieving metadata, ignoring frame");
                                } else {
                                    ((kya) obj9).c.a(poeVarD);
                                    nkw nkwVar = nkw.COTTAGE;
                                    Object obj10 = obj6;
                                    if (obj10 != nkwVar && obj10 != nkw.SERENGETI) {
                                        ((kya) obj9).b.a(poeVarD);
                                    }
                                }
                                pdkVar.close();
                            } finally {
                            }
                        }
                    });
                    break;
                }
                break;
        }
    }

    public /* synthetic */ fmz(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
