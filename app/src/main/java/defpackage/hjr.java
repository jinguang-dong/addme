package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hjr implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final tzx e;

    public hjr(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5) {
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
        this.e = tzxVar5;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Runnable a() {
        return !((Boolean) this.a.a()).booleanValue() ? szd.a : new hjq(((kiu) this.e).a(), (hjy) this.b.a(), ((Boolean) this.c.a()).booleanValue(), this.d, 0);
    }
}
