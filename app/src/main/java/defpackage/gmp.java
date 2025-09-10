package defpackage;

import android.content.Context;
import android.widget.ImageView;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gmp implements ksf {
    public boolean a;
    public paq b;
    public final krj c;
    public final luj d;
    private final Context e;
    private final owq f;
    private final kqy g;
    private final imi h;

    public gmp(krj krjVar, kqy kqyVar, imi imiVar, Context context, luj lujVar, luj lujVar2, owq owqVar) {
        this.c = krjVar;
        this.g = kqyVar;
        this.h = imiVar;
        this.e = context;
        this.d = lujVar2;
        this.f = owqVar;
        this.a = ((Boolean) lujVar.b(luf.af)).booleanValue();
    }

    @Override // defpackage.ksf
    public final void a() {
        if (this.a || !((Boolean) this.f.dL()).booleanValue()) {
            return;
        }
        kqy kqyVar = this.g;
        ImageView imageViewD = kqyVar.d.d(kqyVar.a.get(R.drawable.ic_sapphire_on));
        Context context = this.e;
        nfh nfhVar = new nfh(context.getString(R.string.sapphire_minibar_tooltip));
        nfhVar.o(imageViewD);
        nfhVar.h();
        nfhVar.j();
        nfhVar.c = 500;
        nfhVar.k();
        nfhVar.d = 5000;
        nfhVar.e = false;
        nfhVar.g = false;
        nfhVar.l = this.h;
        nfhVar.k = 4;
        nfhVar.f(new gku(this, 14), context.getMainExecutor());
        this.b = nfhVar.a();
    }

    @Override // defpackage.ksf
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.ksf
    public final /* synthetic */ void c() {
    }
}
