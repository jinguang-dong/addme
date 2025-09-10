package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class fkj implements Consumer {
    private final /* synthetic */ int a;

    public /* synthetic */ fkj(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [gcc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [gcc, java.lang.Object] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void d(Object obj) {
        switch (this.a) {
            case 0:
                ((fko) obj).close();
                break;
            case 1:
                sgv sgvVar = fip.a;
                ((syu) obj).cancel(false);
                break;
            case 2:
                ((fky) obj).close();
                break;
            case 3:
                ((fmg) obj).close();
                break;
            case 4:
                ((fyt) obj).i();
                break;
            case 5:
                ((fyt) obj).f();
                break;
            case 6:
                ((fyt) obj).j();
                break;
            case 7:
                ((fyt) obj).g();
                break;
            case 8:
                ((fyt) obj).h();
                break;
            case 9:
                ((gcv) obj).f();
                break;
            case 10:
                break;
            case 11:
                gdu gduVar = (gdu) obj;
                gduVar.f.execute(gduVar.e);
                break;
            case 12:
                gdu gduVar2 = (gdu) obj;
                gduVar2.f.execute(gduVar2.e);
                break;
            case 13:
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                gbt gbtVar = (gbt) obj;
                if (!gbtVar.f()) {
                    gbtVar.b().f();
                    if (gbtVar.d().h()) {
                        gbtVar.d().c().f();
                        break;
                    }
                } else {
                    gbtVar.b().close();
                    if (gbtVar.d().h()) {
                        gbtVar.d().c().close();
                        break;
                    }
                }
                break;
            case 15:
                ((oyi) obj).l();
                break;
            case 16:
                oyi oyiVar = (oyi) obj;
                oyiVar.j();
                oyiVar.close();
                break;
            case 17:
                oyi oyiVar2 = (oyi) obj;
                oyiVar2.j();
                oyiVar2.close();
                break;
            case 18:
                ((oyx) obj).a(oyu.AUDIO_RECORD_ERROR);
                break;
            case 19:
                ((oyj) obj).g();
                break;
            default:
                ((gso) obj).g.k();
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
