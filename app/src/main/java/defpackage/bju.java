package defpackage;

import android.view.autofill.AutofillManager;
import defpackage.bij;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bju {
    public final uiu a;
    public final uif b;
    public final bjq d;
    public bkb f;
    private final uif i;
    private yz j;
    public final bkb c = new bkb(2, null, 6);
    public final mwu h = new mwu(null);
    public final bik e = new bwa() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
        @Override // defpackage.bwa
        public final /* bridge */ /* synthetic */ bij a() {
            return this.a.c;
        }

        @Override // defpackage.bwa
        public final /* bridge */ /* synthetic */ void b(bij bijVar) {
        }

        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return this.a.c.hashCode();
        }
    };
    public final zo g = new zo(1);

    public bju(uiq uiqVar, uiu uiuVar, uif uifVar, uif uifVar2) {
        this.a = uiuVar;
        this.b = uifVar;
        this.i = uifVar2;
        this.d = new bjq(uiqVar, new nt((Object) this, 3, (short[]) null), new ujr(this) { // from class: bjs
            @Override // defpackage.ujr
            public final Object b() {
                return ((bju) this.e).f;
            }
        });
    }

    private final void h() {
        bwe bweVar;
        bkb bkbVar = this.f;
        if (bkbVar == null) {
            return;
        }
        e(null);
        bka bkaVar = bka.a;
        bka bkaVar2 = bka.d;
        bkbVar.l(bkaVar, bkaVar2);
        if (!bkbVar.m.w) {
            bqs.c("visitAncestors called on an unattached node");
        }
        bij bijVar = bkbVar.m.p;
        bvm bvmVarB = bko.B(bkbVar);
        while (bvmVarB != null) {
            if ((bvmVarB.s.f.o & 1024) != 0) {
                while (bijVar != null) {
                    if ((bijVar.n & 1024) != 0) {
                        bij bijVarY = bijVar;
                        bdp bdpVar = null;
                        while (bijVarY != null) {
                            if (bijVarY instanceof bkb) {
                                ((bkb) bijVarY).l(bka.b, bkaVar2);
                            } else if ((bijVarY.n & 1024) != 0 && (bijVarY instanceof bup)) {
                                int i = 0;
                                for (bij bijVar2 = ((bup) bijVarY).y; bijVar2 != null; bijVar2 = bijVar2.q) {
                                    if ((bijVar2.n & 1024) != 0) {
                                        i++;
                                        if (i == 1) {
                                            bijVarY = bijVar2;
                                        } else {
                                            if (bdpVar == null) {
                                                bdpVar = new bdp(new bij[16]);
                                            }
                                            if (bijVarY != null) {
                                                bdpVar.n(bijVarY);
                                            }
                                            bdpVar.n(bijVar2);
                                            bijVarY = null;
                                        }
                                    }
                                }
                                if (i != 1) {
                                }
                            }
                            bijVarY = bko.y(bdpVar);
                        }
                    }
                    bijVar = bijVar.p;
                }
            }
            bvmVarB = bvmVarB.j();
            bijVar = (bvmVarB == null || (bweVar = bvmVarB.s) == null) ? null : bweVar.e;
        }
    }

    public final bkb a() {
        return acv.x(this.c);
    }

    public final bkg b() {
        bkb bkbVarA = a();
        if (bkbVarA != null) {
            return acv.z(bkbVarA);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:247:0x014b, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01e4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e4  */
    /* JADX WARN: Type inference failed for: r13v0, types: [bjt, uiq] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v14, types: [bij] */
    /* JADX WARN: Type inference failed for: r1v7, types: [bij] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r22v0, types: [uiq] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [bij] */
    /* JADX WARN: Type inference failed for: r2v12, types: [bkb] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [bij] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [bdp] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [bdp] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v11, types: [bij] */
    /* JADX WARN: Type inference failed for: r4v12, types: [bij, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13, types: [bij] */
    /* JADX WARN: Type inference failed for: r5v11, types: [bij] */
    /* JADX WARN: Type inference failed for: r5v12, types: [bij] */
    /* JADX WARN: Type inference failed for: r5v13, types: [bij] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21, types: [bij] */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26, types: [bij] */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20, types: [bdp] */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23, types: [bdp] */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Boolean c(int r20, defpackage.bkg r21, defpackage.uiq r22) {
        /*
            Method dump skipped, instructions count: 839
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bju.c(int, bkg, uiq):java.lang.Boolean");
    }

    public final void d(boolean z) {
        g(z, true, 8);
    }

    public final void e(bkb bkbVar) {
        bvm bvmVarB;
        cbn cbnVarP;
        bvm bvmVarB2;
        cbn cbnVarP2;
        bkb bkbVar2 = this.f;
        this.f = bkbVar;
        zo zoVar = this.g;
        Object[] objArr = zoVar.a;
        int i = zoVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            bit bitVar = (bit) objArr[i2];
            if (bkbVar2 != null && (bvmVarB2 = bko.B(bkbVar2)) != null && (cbnVarP2 = bvmVarB2.p()) != null && bay.p(cbnVarP2)) {
                ((AutofillManager) bitVar.h.a).notifyViewExited(bitVar.a, bvmVarB2.c);
            }
            if (bkbVar != null && (bvmVarB = bko.B(bkbVar)) != null && (cbnVarP = bvmVarB.p()) != null && bay.p(cbnVarP)) {
                int i3 = bvmVarB.c;
                bitVar.b.a.b(i3, new bip(bitVar, i3));
            }
        }
    }

    public final boolean g(boolean z, boolean z2, int i) {
        boolean z3;
        if (z) {
            h();
        } else {
            int iC = acv.C(this.c, i);
            int i2 = iC - 1;
            if (iC == 0) {
                throw null;
            }
            if (i2 != 0) {
                if (i2 != 1 && i2 != 2) {
                    throw new uet();
                }
                z3 = false;
                if (z3 || !z2) {
                    return z3;
                }
                this.b.a();
                return true;
            }
            h();
        }
        z3 = true;
        if (z3) {
        }
        return z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ba, code lost:
    
        r34 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c5, code lost:
    
        if (((r10 & ((~r10) << 6)) & (-9187201950435737472L)) == 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c7, code lost:
    
        r3 = r2.b(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00cd, code lost:
    
        if (r2.e != 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00de, code lost:
    
        if (((r2.a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e2, code lost:
    
        r3 = r2.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e6, code lost:
    
        if (r3 <= 8) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e8, code lost:
    
        r23 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00fa, code lost:
    
        if (java.lang.Long.compare((r2.d * 32) ^ Long.MIN_VALUE, (r3 * 25) ^ Long.MIN_VALUE) <= 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00fe, code lost:
    
        r3 = r2.a;
        r6 = r2.c;
        r9 = r2.b;
        r10 = (r6 + 7) >> 3;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x010a, code lost:
    
        if (r11 >= r10) goto L450;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x010c, code lost:
    
        r12 = r3[r11] & (-9187201950435737472L);
        r3[r11] = ((~r12) + (r12 >>> 7)) & (-72340172838076674L);
        r11 = r11 + 1;
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0125, code lost:
    
        r36 = r8;
        r33 = 1;
        r7 = defpackage.rnt.ai(r3);
        r8 = r7 - 1;
        r12 = 72057594037927935L;
        r3[r8] = (r3[r8] & 72057594037927935L) | (-72057594037927936L);
        r3[r7] = r3[0];
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0143, code lost:
    
        if (r7 == r6) goto L451;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0145, code lost:
    
        r8 = r7 >> 3;
        r16 = (r7 & 7) << 3;
        r10 = (r3[r8] >> r16) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0153, code lost:
    
        if (r10 != 128) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0155, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x015a, code lost:
    
        if (r10 == 254) goto L452;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x015d, code lost:
    
        r10 = defpackage.a.r(r9[r7]) * r34;
        r10 = r10 ^ (r10 << 16);
        r11 = r10 >>> 7;
        r17 = r2.b(r11);
        r11 = r11 & r6;
        r27 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x017e, code lost:
    
        if ((((r17 - r11) & r6) / 8) != (((r7 - r11) & r6) / 8)) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0180, code lost:
    
        r13 = r6;
        r37 = r9;
        r3[r8] = ((~(255 << r16)) & r3[r8]) | ((r10 & 127) << r16);
        r3[defpackage.rnt.ai(r3)] = (r3[0] & r27) | Long.MIN_VALUE;
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01a4, code lost:
    
        r6 = r13;
        r12 = r27;
        r9 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01aa, code lost:
    
        r13 = r6;
        r26 = r7;
        r37 = r9;
        r6 = r17 >> 3;
        r7 = r3[r6];
        r9 = r10 & 127;
        r10 = (r17 & 7) << 3;
        r11 = ~(255 << r10);
        r6 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01c9, code lost:
    
        if (((r7 >> r10) & 255) != 128) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01cb, code lost:
    
        r3[r6] = (r6 << r10) | (r7 & r11);
        r3[r8] = (r3[r8] & (~(255 << r16))) | (128 << r16);
        r37[r17] = r37[r26];
        r37[r26] = 0;
        r7 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01e5, code lost:
    
        r3[r6] = (r6 << r10) | (r7 & r11);
        r6 = r37[r17];
        r37[r17] = r37[r26];
        r37[r26] = r6;
        r7 = r26 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01f5, code lost:
    
        r3[defpackage.rnt.ai(r3)] = (r3[0] & r27) | Long.MIN_VALUE;
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0205, code lost:
    
        r2.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x020a, code lost:
    
        r23 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x020c, code lost:
    
        r36 = r8;
        r33 = 1;
        r3 = defpackage.zv.b(r2.c);
        r6 = r2.a;
        r7 = r2.b;
        r8 = r2.c;
        r2.d(r3);
        r3 = r2.a;
        r9 = r2.b;
        r10 = r2.c;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0227, code lost:
    
        if (r11 >= r8) goto L447;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0237, code lost:
    
        if (((r6[r11 >> 3] >> ((r11 & 7) << 3)) & 255) >= r23) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0239, code lost:
    
        r12 = r7[r11];
        r16 = defpackage.a.r(r12) * r34;
        r16 = r16 ^ (r16 << 16);
        r17 = r3;
        r3 = r2.b(r16 >>> 7);
        r3 = r16 & 127;
        r16 = r3 >> 3;
        r27 = (r3 & 7) << 3;
        r30 = r6;
        r31 = r7;
        r6 = (r17[r16] & (~(255 << r27))) | (r3 << r27);
        r17[r16] = r6;
        r17[(((r3 - 7) & r10) + (r10 & 7)) >> 3] = r6;
        r9[r3] = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0279, code lost:
    
        r17 = r3;
        r30 = r6;
        r31 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x027f, code lost:
    
        r11 = r11 + 1;
        r3 = r17;
        r6 = r30;
        r7 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0288, code lost:
    
        r3 = r2.b(r36);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x028f, code lost:
    
        r23 = 128;
        r33 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0293, code lost:
    
        r2.d++;
        r6 = r2.e;
        r7 = r2.a;
        r8 = r3 >> 3;
        r9 = r7[r8];
        r11 = (r3 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x02ab, code lost:
    
        if (((r9 >> r11) & 255) != r23) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02ad, code lost:
    
        r12 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x02b0, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x02b2, code lost:
    
        r2.e = r6 - r12;
        r6 = r2.c;
        r9 = (r9 & (~(255 << r11))) | (r14 << r11);
        r7[r8] = r9;
        r7[(((r3 - 7) & r6) + (r6 & 7)) >> 3] = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x035b, code lost:
    
        if (((r3 & ((~r3) << 6)) & (-9187201950435737472L)) == 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x035d, code lost:
    
        r11 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0456 A[Catch: all -> 0x06b1, TryCatch #0 {all -> 0x06b1, blocks: (B:3:0x000a, B:5:0x0010, B:6:0x001b, B:8:0x0040, B:10:0x0044, B:11:0x004b, B:12:0x005f, B:15:0x0097, B:67:0x02ca, B:92:0x0398, B:95:0x03a3, B:97:0x03a9, B:98:0x03ae, B:100:0x03b6, B:102:0x03bb, B:104:0x03c1, B:108:0x03c7, B:208:0x04e3, B:210:0x04eb, B:211:0x04ee, B:213:0x04fb, B:247:0x0561, B:249:0x0567, B:251:0x056b, B:217:0x0508, B:221:0x0512, B:224:0x0518, B:225:0x051d, B:245:0x0559, B:226:0x0521, B:228:0x0527, B:230:0x052b, B:232:0x0534, B:234:0x053a, B:238:0x0543, B:240:0x054c, B:241:0x054f, B:242:0x0553, B:246:0x055e, B:254:0x0572, B:256:0x057a, B:260:0x058a, B:261:0x059a, B:263:0x059e, B:265:0x05a2, B:292:0x05f7, B:266:0x05a5, B:268:0x05ae, B:270:0x05b2, B:272:0x05ba, B:274:0x05c0, B:276:0x05c5, B:277:0x05c8, B:279:0x05ce, B:280:0x05d5, B:282:0x05dd, B:284:0x05e3, B:285:0x05e6, B:286:0x05e8, B:288:0x05ee, B:289:0x05f1, B:293:0x0602, B:296:0x0611, B:297:0x0621, B:299:0x0625, B:301:0x0629, B:332:0x0686, B:304:0x0632, B:306:0x063b, B:308:0x063f, B:310:0x0647, B:312:0x064d, B:314:0x0652, B:315:0x0655, B:317:0x065b, B:318:0x0662, B:320:0x066a, B:322:0x0670, B:323:0x0673, B:324:0x0675, B:326:0x067b, B:327:0x067e, B:335:0x0694, B:337:0x069c, B:112:0x03cf, B:114:0x03d5, B:115:0x03d8, B:117:0x03e0, B:149:0x043c, B:151:0x0442, B:153:0x0446, B:121:0x03ed, B:125:0x03f7, B:156:0x044c, B:158:0x0450, B:128:0x03fc, B:130:0x0402, B:132:0x0406, B:134:0x040f, B:136:0x0415, B:140:0x041e, B:142:0x0427, B:143:0x042a, B:144:0x042e, B:147:0x0434, B:148:0x0439, B:159:0x0456, B:161:0x045e, B:162:0x0461, B:164:0x046b, B:196:0x04c7, B:198:0x04cd, B:200:0x04d1, B:168:0x0478, B:172:0x0482, B:203:0x04d7, B:205:0x04db, B:175:0x0487, B:177:0x048d, B:179:0x0491, B:181:0x049a, B:183:0x04a0, B:187:0x04a9, B:189:0x04b2, B:190:0x04b5, B:191:0x04b9, B:194:0x04bf, B:195:0x04c4, B:18:0x00b1, B:19:0x00ba, B:21:0x00c7, B:23:0x00cf, B:26:0x00e2, B:28:0x00e8, B:53:0x020c, B:55:0x0229, B:57:0x0239, B:59:0x027f, B:60:0x0288, B:62:0x0293, B:66:0x02b2, B:31:0x00fe, B:33:0x010c, B:34:0x0125, B:36:0x0145, B:38:0x0155, B:42:0x015d, B:44:0x0180, B:46:0x01aa, B:48:0x01cb, B:50:0x01f5, B:49:0x01e5, B:51:0x0205, B:68:0x02d0, B:69:0x02df, B:71:0x02f0, B:73:0x02f4, B:75:0x02fa, B:77:0x02fe, B:78:0x030e, B:81:0x033d, B:89:0x0361, B:84:0x034e, B:85:0x0353, B:90:0x0389), top: B:346:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04e3 A[Catch: all -> 0x06b1, TryCatch #0 {all -> 0x06b1, blocks: (B:3:0x000a, B:5:0x0010, B:6:0x001b, B:8:0x0040, B:10:0x0044, B:11:0x004b, B:12:0x005f, B:15:0x0097, B:67:0x02ca, B:92:0x0398, B:95:0x03a3, B:97:0x03a9, B:98:0x03ae, B:100:0x03b6, B:102:0x03bb, B:104:0x03c1, B:108:0x03c7, B:208:0x04e3, B:210:0x04eb, B:211:0x04ee, B:213:0x04fb, B:247:0x0561, B:249:0x0567, B:251:0x056b, B:217:0x0508, B:221:0x0512, B:224:0x0518, B:225:0x051d, B:245:0x0559, B:226:0x0521, B:228:0x0527, B:230:0x052b, B:232:0x0534, B:234:0x053a, B:238:0x0543, B:240:0x054c, B:241:0x054f, B:242:0x0553, B:246:0x055e, B:254:0x0572, B:256:0x057a, B:260:0x058a, B:261:0x059a, B:263:0x059e, B:265:0x05a2, B:292:0x05f7, B:266:0x05a5, B:268:0x05ae, B:270:0x05b2, B:272:0x05ba, B:274:0x05c0, B:276:0x05c5, B:277:0x05c8, B:279:0x05ce, B:280:0x05d5, B:282:0x05dd, B:284:0x05e3, B:285:0x05e6, B:286:0x05e8, B:288:0x05ee, B:289:0x05f1, B:293:0x0602, B:296:0x0611, B:297:0x0621, B:299:0x0625, B:301:0x0629, B:332:0x0686, B:304:0x0632, B:306:0x063b, B:308:0x063f, B:310:0x0647, B:312:0x064d, B:314:0x0652, B:315:0x0655, B:317:0x065b, B:318:0x0662, B:320:0x066a, B:322:0x0670, B:323:0x0673, B:324:0x0675, B:326:0x067b, B:327:0x067e, B:335:0x0694, B:337:0x069c, B:112:0x03cf, B:114:0x03d5, B:115:0x03d8, B:117:0x03e0, B:149:0x043c, B:151:0x0442, B:153:0x0446, B:121:0x03ed, B:125:0x03f7, B:156:0x044c, B:158:0x0450, B:128:0x03fc, B:130:0x0402, B:132:0x0406, B:134:0x040f, B:136:0x0415, B:140:0x041e, B:142:0x0427, B:143:0x042a, B:144:0x042e, B:147:0x0434, B:148:0x0439, B:159:0x0456, B:161:0x045e, B:162:0x0461, B:164:0x046b, B:196:0x04c7, B:198:0x04cd, B:200:0x04d1, B:168:0x0478, B:172:0x0482, B:203:0x04d7, B:205:0x04db, B:175:0x0487, B:177:0x048d, B:179:0x0491, B:181:0x049a, B:183:0x04a0, B:187:0x04a9, B:189:0x04b2, B:190:0x04b5, B:191:0x04b9, B:194:0x04bf, B:195:0x04c4, B:18:0x00b1, B:19:0x00ba, B:21:0x00c7, B:23:0x00cf, B:26:0x00e2, B:28:0x00e8, B:53:0x020c, B:55:0x0229, B:57:0x0239, B:59:0x027f, B:60:0x0288, B:62:0x0293, B:66:0x02b2, B:31:0x00fe, B:33:0x010c, B:34:0x0125, B:36:0x0145, B:38:0x0155, B:42:0x015d, B:44:0x0180, B:46:0x01aa, B:48:0x01cb, B:50:0x01f5, B:49:0x01e5, B:51:0x0205, B:68:0x02d0, B:69:0x02df, B:71:0x02f0, B:73:0x02f4, B:75:0x02fa, B:77:0x02fe, B:78:0x030e, B:81:0x033d, B:89:0x0361, B:84:0x034e, B:85:0x0353, B:90:0x0389), top: B:346:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0394  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(android.view.KeyEvent r44, defpackage.uif r45) {
        /*
            Method dump skipped, instructions count: 1718
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bju.f(android.view.KeyEvent, uif):boolean");
    }
}
