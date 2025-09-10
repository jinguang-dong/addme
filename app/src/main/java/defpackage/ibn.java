package defpackage;

import com.google.android.apps.camera.rectiface.Rectiface$RectifaceCallback;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ibn implements Rectiface$RectifaceCallback {
    final /* synthetic */ icj a;
    private final /* synthetic */ int b;

    public ibn(icj icjVar, int i) {
        this.b = i;
        this.a = icjVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kmm] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kmm] */
    @Override // com.google.android.apps.camera.rectiface.Rectiface$RectifaceCallback
    public final void update(float f) {
        if (this.b != 0) {
            this.a.r.c.a(ibo.a, f);
        } else {
            this.a.r.c.a(ibo.a, f);
        }
    }

    @Override // com.google.android.apps.camera.rectiface.Rectiface$RectifaceCallback
    public final /* synthetic */ void saveImageCopy() {
    }
}
