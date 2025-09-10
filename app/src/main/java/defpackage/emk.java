package defpackage;

import android.hardware.Camera;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class emk implements Camera.PictureCallback {
    final /* synthetic */ Handler a;
    public final /* synthetic */ emy b;
    final /* synthetic */ emm c;

    public emk(emm emmVar, Handler handler, emy emyVar) {
        this.c = emmVar;
        this.a = handler;
        this.b = emyVar;
    }

    @Override // android.hardware.Camera.PictureCallback
    public final void onPictureTaken(byte[] bArr, Camera camera) {
        ent entVar = this.c.a.e;
        if (entVar.a() != 8) {
            enz.c(emr.a, "picture callback returning when not capturing");
        } else {
            entVar.c(2);
        }
        this.a.post(new eao((Object) this, (Object) bArr, 7, (byte[]) null));
    }
}
