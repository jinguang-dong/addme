package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bwe {
    public final bvm a;
    public final bwd b;
    public final bva c;
    public bwi d;
    public final bij e;
    public bij f;
    public bdp g;
    public bdp h;
    public final bdp i;
    private bwc j;

    public bwe(bvm bvmVar) {
        this.a = bvmVar;
        bwd bwdVar = new bwd();
        bwdVar.o = -1;
        this.b = bwdVar;
        bva bvaVar = new bva(bvmVar);
        this.c = bvaVar;
        this.d = bvaVar;
        bxa bxaVar = bvaVar.f;
        this.e = bxaVar;
        this.f = bxaVar;
        this.i = new bdp(new bik[16]);
    }

    public static final bij k(bii biiVar, bij bijVar) {
        bij buiVar;
        if (biiVar instanceof bwa) {
            buiVar = ((bwa) biiVar).a();
            buiVar.n = bwj.c(buiVar);
        } else {
            buiVar = new bui(biiVar);
        }
        if (buiVar.w) {
            bqs.c("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        buiVar.t = true;
        bij bijVar2 = bijVar.q;
        if (bijVar2 != null) {
            bijVar2.p = buiVar;
            buiVar.q = bijVar2;
        }
        bijVar.q = buiVar;
        buiVar.p = bijVar;
        return buiVar;
    }

    public static final bij l(bij bijVar) {
        if (bijVar.w) {
            bwj.f(bijVar);
            bijVar.H();
            bijVar.E();
        }
        bij bijVar2 = bijVar.q;
        bij bijVar3 = bijVar.p;
        if (bijVar2 != null) {
            bijVar2.p = bijVar3;
            bijVar.q = null;
        }
        if (bijVar3 != null) {
            bijVar3.q = bijVar2;
            bijVar.p = null;
        }
        bijVar3.getClass();
        return bijVar3;
    }

    public static final void m(bii biiVar, bii biiVar2, bij bijVar) {
        if ((biiVar instanceof bwa) && (biiVar2 instanceof bwa)) {
            bijVar.getClass();
            ((bwa) biiVar2).b(bijVar);
            if (bijVar.w) {
                bwj.g(bijVar);
                return;
            } else {
                bijVar.u = true;
                return;
            }
        }
        if (!(bijVar instanceof bui)) {
            bqs.c("Unknown Modifier.Node type");
            return;
        }
        bui buiVar = (bui) bijVar;
        if (buiVar.w) {
            buiVar.r();
        }
        buiVar.a = biiVar2;
        buiVar.n = bwj.a(biiVar2);
        if (buiVar.w) {
            buiVar.q(false);
        }
        if (bijVar.w) {
            bwj.g(bijVar);
        } else {
            bijVar.u = true;
        }
    }

    public final int a() {
        return this.f.o;
    }

    public final void b() {
        for (bij bijVar = this.f; bijVar != null; bijVar = bijVar.q) {
            bijVar.D();
        }
    }

    public final void c() {
        for (bij bijVar = this.e; bijVar != null; bijVar = bijVar.p) {
            if (bijVar.w) {
                bijVar.E();
            }
        }
    }

    public final void d(bij bijVar, bwi bwiVar) {
        for (bij bijVar2 = bijVar.p; bijVar2 != null; bijVar2 = bijVar2.p) {
            if (bijVar2 == this.b) {
                bvm bvmVarJ = this.a.j();
                bwiVar.w = bvmVarJ != null ? bvmVarJ.n() : null;
                this.d = bwiVar;
                return;
            } else {
                if ((bijVar2.n & 2) != 0) {
                    return;
                }
                bijVar2.K(bwiVar);
            }
        }
    }

    public final void e() {
        bva bvaVar;
        bwi bwiVar = this.d;
        while (true) {
            bvaVar = this.c;
            if (bwiVar == bvaVar) {
                break;
            }
            bwiVar.ad();
            bwiVar = bwiVar.v;
            bwiVar.getClass();
        }
        bvaVar.ad();
        for (bij bijVar = this.f; bijVar != null; bijVar = bijVar.q) {
            bijVar.G();
            if (bijVar.t) {
                bwj.d(bijVar);
            }
            if (bijVar.u) {
                bwj.g(bijVar);
            }
            bijVar.t = false;
            bijVar.u = false;
        }
    }

    public final void f() {
        for (bij bijVar = this.e; bijVar != null; bijVar = bijVar.p) {
            if (bijVar.w) {
                bijVar.H();
            }
        }
        bwi bwiVar = this.c;
        bwi bwiVar2 = this.d;
        while (bwiVar != bwiVar2) {
            bwiVar.af();
            bwiVar = bwiVar.w;
            bwiVar.getClass();
        }
        bwiVar2.af();
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x012d, code lost:
    
        r1 = r12;
        r20 = r13;
        r13 = r15;
        r12 = r11;
        r11 = r14;
        r15 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0135, code lost:
    
        if (r15 > r5) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0137, code lost:
    
        if (r15 == r9) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0139, code lost:
    
        r14 = r15 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x013b, code lost:
    
        if (r15 == r5) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x013d, code lost:
    
        r32 = r12;
        r19 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x014b, code lost:
    
        if (defpackage.bul.a(r3, r15 + 1) >= defpackage.bul.a(r3, r14)) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x014e, code lost:
    
        r32 = r12;
        r19 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0152, code lost:
    
        r12 = defpackage.bul.a(r3, r14);
        r13 = r12 - 1;
        r14 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x015a, code lost:
    
        r32 = r12;
        r19 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x015e, code lost:
    
        r13 = defpackage.bul.a(r3, r15 + 1);
        r14 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0166, code lost:
    
        r12 = r1 - ((r19 - r13) - r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x016b, code lost:
    
        if (r5 == 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x016d, code lost:
    
        r21 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0170, code lost:
    
        r21 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0172, code lost:
    
        if (r13 != r14) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0174, code lost:
    
        r22 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0177, code lost:
    
        r22 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x017b, code lost:
    
        if (r13 <= r6) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x017d, code lost:
    
        if (r12 <= r11) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x017f, code lost:
    
        r24 = r12;
        r12 = r13 - 1;
        r25 = r14;
        r14 = r24 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x018b, code lost:
    
        if (r0.a(r12, r14) == false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x018d, code lost:
    
        r13 = r12;
        r12 = r14;
        r14 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0192, code lost:
    
        r24 = r12;
        r25 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0196, code lost:
    
        r12 = (r18 & 1) ^ 1;
        defpackage.bul.b(r3, r15, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x019d, code lost:
    
        if (r12 == 0) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x019f, code lost:
    
        r12 = r18 - r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a1, code lost:
    
        if (r12 < r9) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a3, code lost:
    
        if (r12 > r5) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01a9, code lost:
    
        if (defpackage.bul.a(r10, r12) < r13) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ab, code lost:
    
        r17 = r32;
        r5 = r19;
        r9 = 3;
        defpackage.amo.l(r13, r24, r25, r12 + (r21 & r22), true, r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0217, code lost:
    
        r12 = r32;
        r13 = r19;
        r15 = r15 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0220, code lost:
    
        r5 = r5 + 1;
        r9 = r31;
        r14 = r11;
        r11 = r12;
        r15 = r13;
        r13 = r20;
        r12 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x011b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00db A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ef  */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(int r28, defpackage.bdp r29, defpackage.bdp r30, defpackage.bij r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 854
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwe.g(int, bdp, bdp, bij, boolean):void");
    }

    public final void h() {
        int i = 0;
        for (bij bijVar = this.e.p; bijVar != null && bijVar != this.b; bijVar = bijVar.p) {
            i |= bijVar.n;
            bijVar.o = i;
        }
    }

    public final void i() {
        bwi bwiVar;
        bwi bwiVar2 = this.c;
        for (bij bijVar = this.e.p; bijVar != null; bijVar = bijVar.p) {
            bve bveVarA = bko.A(bijVar);
            if (bveVarA != null) {
                bwi bwiVar3 = bijVar.s;
                if (bwiVar3 != null) {
                    bvh bvhVar = (bvh) bwiVar3;
                    bve bveVar = bvhVar.f;
                    bvhVar.D(bveVarA);
                    bwiVar = bvhVar;
                    if (bveVar != bijVar) {
                        bvhVar.ag();
                        bwiVar = bvhVar;
                    }
                } else {
                    bwi bvhVar2 = new bvh(this.a, bveVarA);
                    bijVar.K(bvhVar2);
                    bwiVar = bvhVar2;
                }
                bwiVar2.w = bwiVar;
                bwiVar.v = bwiVar2;
                bwiVar2 = bwiVar;
            } else {
                bijVar.K(bwiVar2);
            }
        }
        bvm bvmVarJ = this.a.j();
        bwiVar2.w = bvmVarJ != null ? bvmVarJ.n() : null;
        this.d = bwiVar2;
    }

    public final boolean j(int i) {
        return (a() & i) != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        bij bijVar = this.f;
        bij bijVar2 = this.e;
        if (bijVar == bijVar2) {
            sb.append("]");
        } else {
            while (true) {
                if (bijVar == null || bijVar == bijVar2) {
                    break;
                }
                sb.append(bijVar.toString());
                if (bijVar.q == bijVar2) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                bijVar = bijVar.q;
            }
        }
        return sb.toString();
    }
}
