package defpackage;

import android.net.Uri;
import com.google.android.apps.camera.autotimer.analysis.jni.wVCD.HHdu;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class gfm implements pow {
    final /* synthetic */ ltf a;
    final /* synthetic */ lsu b;
    final /* synthetic */ lte c;
    final /* synthetic */ boolean d;
    final /* synthetic */ ltg e;
    final /* synthetic */ List f;
    final /* synthetic */ gfn g;

    public gfm(gfn gfnVar, ltf ltfVar, lsu lsuVar, lte lteVar, boolean z, ltg ltgVar, List list) {
        this.a = ltfVar;
        this.b = lsuVar;
        this.c = lteVar;
        this.d = z;
        this.e = ltgVar;
        this.f = list;
        this.g = gfnVar;
    }

    @Override // defpackage.pow
    public final void a() {
        lte lteVar = this.c;
        gfn gfnVar = this.g;
        gfnVar.d.g(lteVar.b, "onAbandoned");
        if (gfnVar.e.h()) {
            int i = this.a == ltf.VIDEO_SNAPSHOT ? 2 : 9;
            ((lru) gfnVar.e.c()).g(i, i, null);
        }
        ((sgt) gfn.a.b().M(871)).s("Video publish abandoned.");
        gfnVar.b(this.f);
    }

    @Override // defpackage.pow
    public final void c() {
        Uri uriB = this.b.b.b();
        boolean z = !uriB.equals(Uri.EMPTY);
        lte lteVar = this.c;
        ltd ltdVar = lteVar.a;
        ltdVar.getClass();
        rnt.O(z, "MediaStoreUri is empty. Insert video into MediaStore failed for %s", ltdVar);
        nzf nzfVarA = lsy.a();
        ltf ltfVar = this.a;
        nzfVarA.g(ltfVar);
        nzfVarA.h(uriB);
        nzfVarA.f(this.d);
        syu syuVarM = ske.M(nzfVarA.e());
        ltdVar.getClass();
        ltg ltgVar = this.e;
        gfn gfnVar = this.g;
        lsp lspVar = gfnVar.b;
        lspVar.h(ltdVar, syuVarM, ltgVar);
        ltdVar.getClass();
        lspVar.g(ltdVar);
        gfnVar.d.c(lteVar.b);
        if (gfnVar.e.h()) {
            int i = ltfVar == ltf.VIDEO_SNAPSHOT ? 2 : 9;
            ((lru) gfnVar.e.c()).f(rvk.a);
            ((lru) gfnVar.e.c()).i(i, i);
        }
        gfnVar.b(this.f);
    }

    @Override // defpackage.pow
    public final void d() {
        lte lteVar = this.c;
        gfn gfnVar = this.g;
        gfnVar.d.g(lteVar.b, "onTimeout");
        gfnVar.b(this.f);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [sgt, shi] */
    @Override // defpackage.pow
    public final void b(Throwable th) {
        lte lteVar = this.c;
        gfn gfnVar = this.g;
        gfnVar.d.g(lteVar.b, HHdu.ocY);
        if (gfnVar.e.h()) {
            int i = this.a == ltf.VIDEO_SNAPSHOT ? 2 : 9;
            ((lru) gfnVar.e.c()).h(i, i, th);
        }
        ((sgt) ((sgt) gfn.a.b().i(th)).M((char) 872)).s("Video publish error.");
        gfnVar.b(this.f);
    }
}
