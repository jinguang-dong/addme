package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.ContentResolver;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class imv implements tzt {
    private final /* synthetic */ int a;
    private final Object b;

    public imv(iso isoVar, int i) {
        this.a = i;
        this.b = isoVar;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        return this.a != 0 ? b() : b();
    }

    public final ContentResolver b() {
        if (this.a != 0) {
            ContentResolver contentResolver = ((Activity) ((iso) this.b).b).getContentResolver();
            contentResolver.getClass();
            return contentResolver;
        }
        ContentResolver contentResolver2 = ((Application) ((iso) this.b).a).getContentResolver();
        contentResolver2.getClass();
        return contentResolver2;
    }
}
