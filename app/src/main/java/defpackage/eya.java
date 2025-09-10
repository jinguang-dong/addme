package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eya implements eqo {
    private final /* synthetic */ int a;

    public eya(int i) {
        this.a = i;
    }

    @Override // defpackage.eqo
    public final /* synthetic */ esw a(Object obj, int i, int i2, eqm eqmVar) {
        int i3 = this.a;
        return i3 != 0 ? i3 != 1 ? new ewa((File) obj) : new exv((Bitmap) obj, 1) : exy.g((Drawable) obj);
    }

    @Override // defpackage.eqo
    public final /* synthetic */ boolean b(Object obj, eqm eqmVar) {
        int i = this.a;
        if (i == 0) {
            return true;
        }
        if (i != 1) {
            return true;
        }
        return true;
    }
}
