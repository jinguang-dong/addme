package defpackage;

import android.content.res.Resources;
import com.google.android.apps.camera.evcomp.EvCompView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lwd implements syf {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public lwd(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [sgt, shi] */
    @Override // defpackage.syf
    public final void a(Throwable th) {
        if (this.b != 0) {
            return;
        }
        ((sgt) ((sgt) lwf.a.b().i(th)).M((char) 4462)).s("shouldStartUpdate threw an exception!");
        lwf lwfVar = (lwf) this.a;
        lwfVar.m.a(4);
        lwfVar.d();
    }

    @Override // defpackage.syf
    public final /* synthetic */ void b(Object obj) throws Resources.NotFoundException {
        if (this.b == 0) {
            if (((Boolean) obj).booleanValue()) {
                Object obj2 = this.a;
                lwf lwfVar = (lwf) obj2;
                ske.W(((lvz) lwfVar.p.a()).a(), new fxw(obj2, 10), lwfVar.k);
                return;
            } else {
                lwf lwfVar2 = (lwf) this.a;
                lwfVar2.m.a(4);
                lwfVar2.d();
                return;
            }
        }
        lag lagVar = (lag) obj;
        hiq hiqVar = (hiq) this.a;
        if (((hhv) hiqVar.e.dL()).equals(hhv.SINGLE)) {
            hiqVar.j();
            return;
        }
        hiqVar.m = lagVar.a;
        hiqVar.n = lagVar.b;
        if (((Boolean) ((ovx) hiqVar.f).d).booleanValue()) {
            EvCompView evCompView = hiqVar.a;
            evCompView.f(hiqVar.m);
            evCompView.h(hiqVar.n);
            evCompView.g(hiqVar.m);
            evCompView.i(hiqVar.n);
        }
    }
}
