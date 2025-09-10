package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tzu implements tzt, tzj {
    public final Object a;

    private tzu(Object obj) {
        this.a = obj;
    }

    public static tzt b(Object obj) {
        obj.getClass();
        return new tzu(obj);
    }

    @Override // defpackage.uem, defpackage.uel
    public final Object a() {
        return this.a;
    }
}
