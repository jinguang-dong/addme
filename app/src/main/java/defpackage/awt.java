package defpackage;

import android.support.v8.renderscript.ScriptIntrinsicBLAS;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awt {
    public static final ayp a = new ayz(bap.c, new adq(19));

    public static final void a(cdo cdoVar, uiu uiuVar, ayc aycVar, int i) {
        int i2;
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(15327438);
        int i4 = 4;
        if (i3 == 0) {
            i2 = (true != aycVarC.B(cdoVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != aycVarC.D(uiuVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && aycVarC.G()) {
            aycVarC.r();
        } else {
            ayp aypVar = a;
            bay.K(aypVar.b(((cdo) aycVarC.e(aypVar)).k(cdoVar)), uiuVar, aycVarC, (i2 & ScriptIntrinsicBLAS.TRANSPOSE) | 8);
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new aqb(cdoVar, uiuVar, i, i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:243:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(java.lang.String r38, defpackage.bik r39, long r40, long r42, defpackage.cfd r44, long r45, long r47, int r49, boolean r50, int r51, int r52, defpackage.cdo r53, defpackage.ayc r54, int r55, int r56, int r57) {
        /*
            Method dump skipped, instructions count: 920
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awt.b(java.lang.String, bik, long, long, cfd, long, long, int, boolean, int, int, cdo, ayc, int, int, int):void");
    }
}
