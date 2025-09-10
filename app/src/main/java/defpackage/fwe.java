package defpackage;

import android.view.ViewStub;
import com.google.android.apps.camera.ui.layout.MainActivityLayout;
import com.google.ar.core.R;
import j$.util.Collection;
import j$.util.concurrent.ConcurrentLinkedQueue;
import j$.util.stream.Stream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fwe implements nkm {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ fwe(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, tzj] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, pbn] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, mxl] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, mxl] */
    /* JADX WARN: Type inference failed for: r6v9, types: [fqa, java.lang.Object] */
    @Override // defpackage.nkm
    public final void a() {
        int i = this.c;
        if (i == 0) {
            this.a.e("WireBottomBar", new fnf(this.b, 8));
            return;
        }
        if (i == 1) {
            ngw ngwVarA = ((ngx) this.b).a();
            ViewStub viewStub = (ViewStub) ((ocq) ngwVarA.j).c(R.id.cottage_help_button_stub);
            viewStub.setLayoutResource(R.layout.cottage_help_button_layout);
            ?? r6 = this.a;
            ((muu) r6).b = viewStub;
            ((MainActivityLayout) ngwVarA.c).h(r6);
            return;
        }
        if (i == 2) {
            Stream stream = Collection.EL.stream(((tzz) this.a).a());
            gnt gntVar = (gnt) this.b.a();
            gntVar.getClass();
            stream.forEach(new gok(gntVar, 0));
            return;
        }
        if (i == 3) {
            rwc rwcVar = (rwc) this.b;
            if (rwcVar.h()) {
                ((jgt) this.a).k((jnp) rwcVar.c());
                return;
            }
            return;
        }
        if (i == 4) {
            ngw ngwVarA2 = ((ngx) this.b).a();
            ViewStub viewStub2 = (ViewStub) ((ocq) ngwVarA2.j).c(R.id.help_ui_astro);
            viewStub2.setLayoutResource(R.layout.astro_toggle_layout);
            ?? r62 = this.a;
            ((muu) r62).b = viewStub2;
            ((MainActivityLayout) ngwVarA2.c).h(r62);
            return;
        }
        hbw hbwVar = (hbw) this.b.a();
        ConcurrentLinkedQueue concurrentLinkedQueue = hbwVar.b.a;
        rnt.M(concurrentLinkedQueue.size() < 4, "More listeners added than is allowed in configured capacity: 4");
        ?? r63 = this.a;
        concurrentLinkedQueue.add(r63);
        if (hbwVar.k.isDone()) {
            r63.a();
        }
    }

    public /* synthetic */ fwe(Object obj, uem uemVar, int i) {
        this.c = i;
        this.a = obj;
        this.b = uemVar;
    }
}
