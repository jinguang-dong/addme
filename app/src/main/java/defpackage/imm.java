package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class imm implements tzt {
    private final /* synthetic */ int a;
    private final Object b;

    public imm(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? b() : b() : b() : b();
    }

    public final Context b() {
        int i = this.a;
        if (i == 0) {
            return (Context) ((iso) this.b).b;
        }
        if (i == 1) {
            Object obj = ((hnw) this.b).a;
            obj.getClass();
            return (Context) obj;
        }
        if (i == 2) {
            return (Context) ((iso) this.b).b;
        }
        if (i == 3) {
            return (Context) ((iso) this.b).b;
        }
        Context context = ((mfx) this.b).a().m;
        context.getClass();
        return context;
    }
}
