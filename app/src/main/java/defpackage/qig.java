package defpackage;

import com.google.android.gms.wearable.aXYS.zflNUOOzDfM;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class qig implements qjt {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ qig(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.qjt
    public final String a() {
        int i = this.b;
        if (i == 0) {
            return zflNUOOzDfM.zdrvbaq + ((qmk) this.a).b.toString() + ")";
        }
        Object obj = this.a;
        if (i != 1) {
            return "createCanvasForSurface(" + obj.toString() + ")";
        }
        return "attachImageToTexture(" + String.valueOf(((qjn) obj).c()) + ")";
    }
}
