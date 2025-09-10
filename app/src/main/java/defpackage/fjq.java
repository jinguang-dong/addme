package defpackage;

import j$.time.Instant;
import java.io.ByteArrayOutputStream;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fjq implements tzt {
    private final /* synthetic */ int a;

    public fjq(int i) {
        this.a = i;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.a) {
            case 0:
                Instant instantNow = Instant.now();
                instantNow.getClass();
                return instantNow;
            case 1:
                return a.O();
            case 2:
                return new fnh();
            case 3:
                return ske.M(ftk.a);
            case 4:
                return qpt.cl();
            case 5:
                return ske.M(ftk.a);
            case 6:
                return new fhf(9);
            case 7:
                return true;
            case 8:
                return a.R();
            case 9:
                return a.O();
            case 10:
                return a.R();
            case 11:
                byte[] bArr = null;
                return new cxb(bArr, bArr);
            case 12:
                return new ovx(gur.a);
            case 13:
                return new hdm();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return peg.a;
            case 15:
                return new hrd(1);
            case 16:
                return new hrd(0);
            case 17:
                return new ByteArrayOutputStream();
            case 18:
                return rvk.a;
            case 19:
                iao iaoVar = iao.SERENGETI;
                iaoVar.getClass();
                return iaoVar;
            default:
                return new jea();
        }
    }
}
