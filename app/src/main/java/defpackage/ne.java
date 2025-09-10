package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ne implements uif {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ne(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [deu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v37, types: [java.lang.Object, uif] */
    /* JADX WARN: Type inference failed for: r5v39, types: [java.lang.Object, uif] */
    /* JADX WARN: Type inference failed for: r5v62, types: [bbo, java.lang.Object] */
    @Override // defpackage.uif
    public final Object a() {
        int i = 1;
        switch (this.b) {
            case 0:
                ?? r5 = this.a;
                nh nhVar = (nh) r5;
                return new cxi(nhVar.getApplication(), r5, nhVar.getIntent() != null ? nhVar.getIntent().getExtras() : null);
            case 1:
                return new qwz(((nh) this.a).m);
            case 2:
                Object obj = this.a;
                nu nuVar = new nu(new ea(obj, 5, 0 == true ? 1 : 0));
                if (a.ao(Looper.myLooper(), Looper.getMainLooper())) {
                    ((nh) obj).k(nuVar);
                    return nuVar;
                }
                new Handler(Looper.getMainLooper()).post(new cmc(obj, nuVar, i, 0 == true ? 1 : 0));
                return nuVar;
            case 3:
                ((nu) this.a).d();
                return ufg.a;
            case 4:
                ((nu) this.a).c();
                return ufg.a;
            case 5:
                return sm.i((sm) this.a);
            case 6:
                return sm.b((sm) this.a);
            case 7:
                return sm.f((sm) this.a);
            case 8:
                return sm.g((sm) this.a);
            case 9:
                return sm.d((sm) this.a);
            case 10:
                return sm.e((sm) this.a);
            case 11:
                return sm.h((sm) this.a);
            case 12:
                HandlerThread handlerThread = new HandlerThread("CXCP-Camera-H", -3);
                handlerThread.start();
                ((byz) this.a).r(3, new ea(handlerThread, 6, 0 == true ? 1 : 0));
                return new Handler(handlerThread.getLooper());
            case 13:
                return this.a.a();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return this.a.a();
            case 15:
                ((abz) this.a).d = false;
                return ufg.a;
            case 16:
                ado adoVar = (ado) this.a;
                return Boolean.valueOf(!a.ao(adoVar.e(), adoVar.d()) || adoVar.q() || ((Boolean) adoVar.b.a()).booleanValue());
            case 17:
                return Long.valueOf(((ado) this.a).a());
            case 18:
                ((aen) this.a).b.a();
                return true;
            case 19:
                return Boolean.valueOf(((bij) this.a).w);
            default:
                return new ocq((uiq) this.a.a());
        }
    }
}
