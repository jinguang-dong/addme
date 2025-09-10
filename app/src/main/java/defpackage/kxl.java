package defpackage;

import android.hardware.camera2.CaptureResult;
import com.google.googlex.gcam.BurstSpec;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class kxl {
    public static final sgv a = sgv.g("kxl");
    public final hyh b;
    public boolean c = false;
    public kwp d;
    public final pfz e;
    private final pbn f;
    private final hzs g;
    private final kxv h;
    private final hzj i;
    private final lat j;
    private final let k;
    private final rwc l;
    private final ley m;
    private final kwr n;
    private final kvg o;
    private final uem p;
    private final gga q;

    public kxl(pbn pbnVar, hzs hzsVar, hyh hyhVar, kxv kxvVar, hzj hzjVar, lat latVar, rwc rwcVar, ley leyVar, kwr kwrVar, kvg kvgVar, pfz pfzVar, gga ggaVar, let letVar, uem uemVar) {
        this.f = pbnVar;
        this.g = hzsVar;
        this.b = hyhVar;
        this.h = kxvVar;
        this.i = hzjVar;
        this.j = latVar;
        this.l = rwcVar;
        this.m = leyVar;
        this.e = pfzVar;
        this.q = ggaVar;
        this.k = letVar;
        this.n = kwrVar;
        this.o = kvgVar;
        this.p = uemVar;
    }

    private final void e(iby ibyVar, int i, int i2, poe poeVar, long j) {
        sgt sgtVar = (sgt) a.c().M(3595);
        Integer numValueOf = Integer.valueOf(i + 1);
        Integer numValueOf2 = Integer.valueOf(i2);
        Long lValueOf = Long.valueOf(j);
        Integer numValueOf3 = Integer.valueOf(ibyVar.a());
        pjr pjrVar = ibyVar.q;
        sgtVar.I("Marking frame %d of %d (frame %s) as invalid for shot %s (camera %s).", numValueOf, numValueOf2, lValueOf, numValueOf3, pjrVar);
        this.g.C(ibyVar, pjrVar, i, poeVar, tbq.a, null);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, lss] */
    private final boolean f(iby ibyVar) {
        if (!this.c) {
            return false;
        }
        ibyVar.a();
        gga ggaVar = this.q;
        ggaVar.b.b(new hhr("Shot has been cancelled by user."));
        this.g.l(ibyVar);
        this.i.a(ibyVar.x.b.l());
        return true;
    }

    private final rwd g(iby ibyVar, int i, int i2, pdk pdkVar, tbq tbqVar, poe poeVar, poe poeVar2, kmk kmkVar, int i3) {
        return b(ibyVar, i, i2, pdkVar, tbqVar, true, rvk.a, poeVar, poeVar2, kmkVar, i3);
    }

    public final paq a() {
        let letVar = this.k;
        return letVar != null ? new kxj(letVar.a(), 0) : new kxk(0);
    }

    public final rwd b(iby ibyVar, int i, int i2, pdk pdkVar, tbq tbqVar, boolean z, rwc rwcVar, poe poeVar, poe poeVar2, kmk kmkVar, int i3) throws Throwable {
        int i4;
        String string;
        pdk pdkVar2;
        iby ibyVar2;
        pjr pjrVarD;
        poe poeVarD;
        Integer num;
        rwd rwdVar;
        kxl kxlVar = this;
        if (z) {
            string = "Frame";
            i4 = i2;
        } else {
            StringBuilder sb = new StringBuilder("SecondaryFrame");
            sb.append(i + 1);
            sb.append("of");
            i4 = i2;
            sb.append(i4);
            string = sb.toString();
        }
        pbn pbnVar = kxlVar.f;
        pbnVar.f(string);
        boolean z2 = false;
        try {
            pdkVar2 = pdkVar;
            try {
                lau lauVarC = kxlVar.j.c(pdkVar2, i3);
                poe poeVarD2 = pdkVar2.d();
                if (z) {
                    CaptureResult.Key key = nvk.m;
                    if (key != null && (poeVarD = pdkVar2.d()) != null && (num = (Integer) poeVarD.a(key)) != null && num.intValue() > 0) {
                        ibyVar.a();
                        pdo pdoVarB = pdkVar2.b();
                        if (poeVarD2 != null && pdoVarB != null) {
                            poeVarD2.a(CaptureResult.CONTROL_AF_STATE);
                        }
                        rwdVar = new rwd(false, null);
                    } else if (kxlVar.c) {
                        rwdVar = new rwd(false, null);
                    } else {
                        kxlVar.b.j(false);
                        kmkVar.f(false);
                        ibyVar2 = ibyVar;
                        kxlVar.i.b(ibyVar2, lauVarC);
                        pjrVarD = lauVarC.l().d();
                    }
                    pdkVar2.close();
                    pbnVar.g();
                    return rwdVar;
                }
                ibyVar2 = ibyVar;
                if (lauVarC.m() != null) {
                    peo peoVarM = lauVarC.m();
                    peoVarM.getClass();
                    pjrVarD = peoVarM.d();
                } else {
                    pjrVarD = lauVarC.l().d();
                }
                pjr pjrVar = pjrVarD;
                pbnVar.f(z ? "RetrievingImage" : "RetrievingImageSecondary");
                poj pojVarP = lauVarC.p();
                pbnVar.g();
                if (pojVarP != null) {
                    if (poeVarD2 != null) {
                        kxlVar.g.n(ibyVar2, pjrVar, i, poeVarD2, tbqVar, pojVarP, lauVarC.o(), lauVarC.n(lcz.DATA_STREAM), lauVarC.s(), rwcVar, poeVar);
                        z2 = true;
                        ibyVar.a();
                        pojVarP.d();
                        poeVarD2.d();
                        pdkVar2.close();
                        kxlVar.f.g();
                        return new rwd(z2, poeVarD2);
                    }
                    poeVarD2 = null;
                }
                if (pojVarP != null) {
                    pojVarP.close();
                }
                if (poeVarD2 == null) {
                    poeVarD2 = poeVar2;
                }
                if (poeVarD2 != null) {
                    pdo pdoVarB2 = pdkVar2.b();
                    poe poeVar3 = poeVarD2;
                    try {
                        kxlVar.e(ibyVar, i, i4, poeVar3, pdoVarB2 != null ? pdoVarB2.c : -1L);
                        kxlVar = kxlVar;
                        poeVarD2 = poeVar3;
                    } catch (Throwable th) {
                        th = th;
                        kxlVar = kxlVar;
                        pdkVar2.close();
                        kxlVar.f.g();
                        throw th;
                    }
                }
                pdkVar2.close();
                kxlVar.f.g();
                return new rwd(z2, poeVarD2);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            pdkVar2 = pdkVar;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x04d4, code lost:
    
        r5.close();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0409 A[Catch: all -> 0x0620, TryCatch #1 {all -> 0x0620, blocks: (B:27:0x0163, B:29:0x0175, B:35:0x0187, B:37:0x018f, B:38:0x0198, B:40:0x019d, B:42:0x01a1, B:44:0x01ac, B:45:0x01b2, B:47:0x01da, B:48:0x01e0, B:49:0x01ed, B:51:0x01f8, B:52:0x01fc, B:54:0x0202, B:55:0x0206, B:56:0x020b, B:58:0x0231, B:60:0x0248, B:62:0x025a, B:65:0x02a1, B:66:0x02a6, B:68:0x02d9, B:69:0x02f4, B:70:0x030d, B:72:0x0313, B:131:0x049b, B:171:0x0570, B:173:0x057a, B:174:0x057f, B:190:0x05c1, B:192:0x05cb, B:197:0x05d6, B:199:0x05e0, B:200:0x05e5, B:201:0x05e8, B:203:0x05ea, B:75:0x0321, B:77:0x0325, B:106:0x03fa, B:108:0x0409, B:109:0x040f, B:111:0x0415, B:113:0x0437, B:128:0x048f, B:118:0x0454, B:120:0x045c, B:122:0x0469, B:123:0x047a, B:124:0x047e, B:126:0x0484, B:79:0x033e, B:81:0x0357, B:82:0x036d, B:85:0x0380, B:88:0x038b, B:90:0x039c, B:99:0x03ce, B:91:0x03a1, B:92:0x03ac, B:94:0x03b2, B:96:0x03c2, B:97:0x03c6, B:98:0x03ca, B:100:0x03d6, B:102:0x03ed, B:105:0x03f8, B:63:0x0297, B:204:0x0601, B:33:0x017d), top: B:213:0x0163, inners: #4, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04b7 A[Catch: all -> 0x05d3, TryCatch #3 {all -> 0x05d3, blocks: (B:135:0x04a4, B:136:0x04b1, B:138:0x04b7, B:140:0x04c3, B:145:0x04d0, B:147:0x04d4, B:148:0x04d9, B:154:0x050a, B:157:0x0512, B:159:0x051c, B:160:0x051f, B:163:0x0532, B:164:0x0535, B:165:0x053b, B:166:0x055c, B:168:0x0562, B:170:0x056e, B:176:0x0584, B:177:0x058b, B:178:0x0590, B:180:0x0596, B:182:0x05a2), top: B:216:0x04a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0596 A[Catch: all -> 0x05d3, LOOP:2: B:178:0x0590->B:180:0x0596, LOOP_END, TryCatch #3 {all -> 0x05d3, blocks: (B:135:0x04a4, B:136:0x04b1, B:138:0x04b7, B:140:0x04c3, B:145:0x04d0, B:147:0x04d4, B:148:0x04d9, B:154:0x050a, B:157:0x0512, B:159:0x051c, B:160:0x051f, B:163:0x0532, B:164:0x0535, B:165:0x053b, B:166:0x055c, B:168:0x0562, B:170:0x056e, B:176:0x0584, B:177:0x058b, B:178:0x0590, B:180:0x0596, B:182:0x05a2), top: B:216:0x04a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x05a2 A[Catch: all -> 0x05d3, TRY_LEAVE, TryCatch #3 {all -> 0x05d3, blocks: (B:135:0x04a4, B:136:0x04b1, B:138:0x04b7, B:140:0x04c3, B:145:0x04d0, B:147:0x04d4, B:148:0x04d9, B:154:0x050a, B:157:0x0512, B:159:0x051c, B:160:0x051f, B:163:0x0532, B:164:0x0535, B:165:0x053b, B:166:0x055c, B:168:0x0562, B:170:0x056e, B:176:0x0584, B:177:0x058b, B:178:0x0590, B:180:0x0596, B:182:0x05a2), top: B:216:0x04a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x05cb A[Catch: all -> 0x0620, TryCatch #1 {all -> 0x0620, blocks: (B:27:0x0163, B:29:0x0175, B:35:0x0187, B:37:0x018f, B:38:0x0198, B:40:0x019d, B:42:0x01a1, B:44:0x01ac, B:45:0x01b2, B:47:0x01da, B:48:0x01e0, B:49:0x01ed, B:51:0x01f8, B:52:0x01fc, B:54:0x0202, B:55:0x0206, B:56:0x020b, B:58:0x0231, B:60:0x0248, B:62:0x025a, B:65:0x02a1, B:66:0x02a6, B:68:0x02d9, B:69:0x02f4, B:70:0x030d, B:72:0x0313, B:131:0x049b, B:171:0x0570, B:173:0x057a, B:174:0x057f, B:190:0x05c1, B:192:0x05cb, B:197:0x05d6, B:199:0x05e0, B:200:0x05e5, B:201:0x05e8, B:203:0x05ea, B:75:0x0321, B:77:0x0325, B:106:0x03fa, B:108:0x0409, B:109:0x040f, B:111:0x0415, B:113:0x0437, B:128:0x048f, B:118:0x0454, B:120:0x045c, B:122:0x0469, B:123:0x047a, B:124:0x047e, B:126:0x0484, B:79:0x033e, B:81:0x0357, B:82:0x036d, B:85:0x0380, B:88:0x038b, B:90:0x039c, B:99:0x03ce, B:91:0x03a1, B:92:0x03ac, B:94:0x03b2, B:96:0x03c2, B:97:0x03c6, B:98:0x03ca, B:100:0x03d6, B:102:0x03ed, B:105:0x03f8, B:63:0x0297, B:204:0x0601, B:33:0x017d), top: B:213:0x0163, inners: #4, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x058b A[EDGE_INSN: B:226:0x058b->B:177:0x058b BREAK  A[LOOP:0: B:136:0x04b1->B:164:0x0535], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.Object, kml] */
    /* JADX WARN: Type inference failed for: r2v5, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r3v15, types: [hyh] */
    /* JADX WARN: Type inference failed for: r5v12, types: [kwr] */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r9v4, types: [kmk] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.laa c(defpackage.iby r23, com.google.googlex.gcam.BurstSpec r24, defpackage.rwc r25, defpackage.poe r26, defpackage.kmk r27, defpackage.pfg r28, defpackage.pdv r29, defpackage.pdv r30, defpackage.paq r31, defpackage.mdm r32, int r33, int r34, int r35, int r36, boolean r37, defpackage.hxu r38, defpackage.kit r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 1575
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kxl.c(iby, com.google.googlex.gcam.BurstSpec, rwc, poe, kmk, pfg, pdv, pdv, paq, mdm, int, int, int, int, boolean, hxu, kit, boolean):laa");
    }

    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object, kml] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, lss] */
    public final laa d(iby ibyVar, int i, int i2, poe poeVar, mdm mdmVar, boolean z, BurstSpec burstSpec, boolean z2) {
        Object obj;
        if (poeVar != null) {
            if (z) {
                mdmVar.c(poeVar, true);
            }
            for (int i3 = i; i3 < i2; i3++) {
                e(ibyVar, i3, i2, poeVar, -1L);
            }
        }
        if (z) {
            ibyVar.x.a.d().b();
            kwp kwpVar = this.d;
            if (kwpVar != null && (obj = kwpVar.b) != null) {
                ((mdo) mdmVar).r = (sno) ((tpc) obj).l();
            }
        }
        this.f.h("HdrPlus#endPayload");
        hzs hzsVar = this.g;
        if (!hzsVar.x(ibyVar, burstSpec)) {
            ((sgt) a.b().M(3585)).t("EndPayloadFrames failed for shot %d.", ibyVar.a());
            return laa.END_PAYLOAD_ERROR;
        }
        if (z) {
            this.i.d(ibyVar, burstSpec);
            ibyVar.x.b.H();
            ibyVar.a();
            if (this.c && !z2) {
                return f(ibyVar) ? laa.NO_ERROR : laa.INTERRUPTED_RESULTS;
            }
        }
        if (hzsVar.y(ibyVar)) {
            ibyVar.a();
            return laa.NO_ERROR;
        }
        ((sgt) a.b().M(3586)).t("EndShotCapture failed for shot %d.", ibyVar.a());
        return laa.END_SHOT_CAPTURE_ERROR;
    }
}
