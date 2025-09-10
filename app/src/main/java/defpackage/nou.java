package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class nou extends nor {
    public final /* synthetic */ nov b;

    public nou(nov novVar) {
        this.b = novVar;
    }

    @Override // defpackage.nor, defpackage.mcz, defpackage.mda
    public final void a() {
        nov novVar = this.b;
        Uri uri = novVar.g;
        if (uri != null) {
            novVar.d.setVideoURI(uri);
        }
        novVar.d.setOnCompletionListener(new mok(this, 2));
        novVar.d.setOnPreparedListener(new mol(this, 2));
    }

    @Override // defpackage.nor
    public void fb() {
        nov novVar = this.b;
        novVar.k.a(novVar.d.getDuration());
        novVar.d.seekTo(novVar.h);
        novVar.k.b(novVar.h);
        novVar.e.d();
    }

    @Override // defpackage.nor
    public void h() {
        nov novVar = this.b;
        novVar.k.a(novVar.d.getDuration());
        novVar.d.seekTo(novVar.h);
        novVar.k.b(novVar.h);
        novVar.e.c();
    }
}
