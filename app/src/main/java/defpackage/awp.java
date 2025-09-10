package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awp {
    public static final ayp a = new bbp(new adq(18));

    public static final blp a(awo awoVar, int i) {
        switch (i - 1) {
            case 6:
                return aqa.a;
            case 7:
                return awoVar.d;
            case 8:
                apu apuVar = awoVar.d;
                apu apuVar2 = awn.a;
                apv apvVar = awn.i;
                return apu.c(apuVar, apvVar, null, null, apvVar, 6);
            case 9:
                return awoVar.f;
            case 10:
            default:
                apu apuVar3 = awoVar.d;
                apu apuVar4 = awn.a;
                apv apvVar2 = awn.i;
                return apu.c(apuVar3, null, apvVar2, apvVar2, null, 9);
            case 11:
                apu apuVar5 = awoVar.d;
                apu apuVar6 = awn.a;
                apv apvVar3 = awn.i;
                return apu.c(apuVar5, null, null, apvVar3, apvVar3, 3);
            case 12:
                return awoVar.c;
            case 13:
                return bll.a;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return awoVar.b;
        }
    }
}
