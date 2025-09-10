package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ohu extends ohv {
    final /* synthetic */ Intent a;
    final /* synthetic */ ogi b;

    public ohu(Intent intent, ogi ogiVar) {
        this.a = intent;
        this.b = ogiVar;
    }

    @Override // defpackage.ohv
    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, 2);
        }
    }
}
