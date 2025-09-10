package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hoa implements tzt {
    private final /* synthetic */ int a;
    private final Object b;

    public hoa(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? b() : b() : b() : b();
    }

    public final Resources b() {
        int i = this.a;
        if (i == 0) {
            Object obj = ((hnw) this.b).b;
            obj.getClass();
            return (Resources) obj;
        }
        if (i == 1) {
            Resources resources = ((imm) this.b).b().getResources();
            resources.getClass();
            return resources;
        }
        if (i != 2) {
            Resources resources2 = ((Application) ((iso) this.b).a).getResources();
            resources2.getClass();
            return resources2;
        }
        Resources resources3 = ((Activity) ((iso) this.b).b).getResources();
        resources3.getClass();
        return resources3;
    }
}
