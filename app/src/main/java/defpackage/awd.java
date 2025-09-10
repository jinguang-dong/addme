package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awd {
    private static final ayp a = new bbp(new adq(15));

    public static final void a(avp avpVar, awh awhVar, awo awoVar, awu awuVar, uiu uiuVar, ayc aycVar, int i) {
        int i2;
        awh awhVar2;
        awu awuVar2;
        awo awoVar2;
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(1317329884);
        if (i3 == 0) {
            i2 = (true != aycVarC.B(avpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != aycVarC.B(awhVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != aycVarC.B(awoVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != aycVarC.B(awuVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != aycVarC.D(uiuVar) ? 8192 : 16384;
        }
        if ((i2 & 9363) == 9362 && aycVarC.G()) {
            aycVarC.r();
        } else {
            ayp aypVar = a;
            if (((Boolean) aycVarC.e(aypVar)).booleanValue()) {
                aycVarC.u(1458700415);
                aycVarC.u(-1061322460);
                ayg aygVar = (ayg) aycVarC;
                aygVar.Y();
                if (awhVar == null) {
                    aycVarC.u(-1061319320);
                    awh awhVarP = bay.P(aycVarC);
                    aygVar.Y();
                    awhVar2 = awhVarP;
                } else {
                    aycVarC.u(-1061320250);
                    aygVar.Y();
                    awhVar2 = awhVar;
                }
                if (awuVar == null) {
                    aycVarC.u(-1061317178);
                    awu awuVarR = bay.R(aycVarC);
                    aygVar.Y();
                    awuVar2 = awuVarR;
                } else {
                    aycVarC.u(-1061318046);
                    aygVar.Y();
                    awuVar2 = awuVar;
                }
                if (awoVar == null) {
                    aycVarC.u(-1061315358);
                    awo awoVarQ = bay.Q(aycVarC);
                    aygVar.Y();
                    awoVar2 = awoVarQ;
                } else {
                    aycVarC.u(-1061316102);
                    aygVar.Y();
                    awoVar2 = awoVar;
                }
                b(avpVar, awhVar2, awoVar2, awuVar2, uiuVar, aycVarC, i2 & 57344);
                aygVar.Y();
            } else {
                aycVarC.u(1459035990);
                bay.K(aypVar.b(true), bdq.k(1535649272, new awc(avpVar, awhVar, awoVar, awuVar, uiuVar), aycVarC), aycVarC, 56);
                ((ayg) aycVarC).Y();
            }
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new awb(avpVar, awhVar, awoVar, awuVar, uiuVar, i, 0);
        }
    }

    public static final void b(avp avpVar, awh awhVar, awo awoVar, awu awuVar, uiu uiuVar, ayc aycVar, int i) {
        int i2;
        char c;
        int i3;
        int i4 = i & 6;
        ayc aycVarC = aycVar.c(904511636);
        if (i4 == 0) {
            i2 = (true != aycVarC.B(avpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != aycVarC.B(awhVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != aycVarC.B(awoVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != aycVarC.B(awuVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != aycVarC.D(uiuVar) ? 8192 : 16384;
        }
        if ((i2 & 9363) == 9362 && aycVarC.G()) {
            aycVarC.r();
        } else {
            aycVarC.s();
            if ((i & 1) != 0 && !aycVarC.E()) {
                aycVarC.r();
            }
            aycVarC.l();
            long j = avpVar.a;
            afr afrVarA = awl.a();
            boolean zA = aycVarC.A(j);
            ayg aygVar = (ayg) aycVarC;
            Object objR = aygVar.R();
            if (zA || objR == ayb.a) {
                c = 4;
                i3 = 2;
                objR = new arp(j, bko.k(bkv.d(j), bkv.c(j), bkv.b(j), 0.4f, bkv.f(j)));
                aygVar.ac(objR);
            } else {
                c = 4;
                i3 = 2;
            }
            bag[] bagVarArr = new bag[6];
            bagVarArr[0] = avq.a.b(avpVar);
            bagVarArr[1] = awi.a.b(awhVar);
            bagVarArr[i3] = afo.a.b(afrVarA);
            bagVarArr[3] = awp.a.b(awoVar);
            bagVarArr[c] = arq.b.b((arp) objR);
            bagVarArr[5] = awv.a.b(awuVar);
            bay.L(bagVarArr, bdq.k(-1750539308, new apf((Object) awuVar, uiuVar, i3), aycVarC), aycVarC, 56);
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new awb(avpVar, awhVar, awoVar, awuVar, uiuVar, i, 1);
        }
    }
}
