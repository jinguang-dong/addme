package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fsn extends oww {
    private final owf a;
    private final owf b;
    private boolean c;

    public fsn(owf owfVar, owf owfVar2, owf owfVar3) {
        super(owfVar);
        a.I(((Integer) owfVar3.dL()).intValue() >= ((Integer) owfVar2.dL()).intValue());
        this.a = owfVar2;
        this.b = owfVar3;
        this.c = d((Integer) owfVar.dL()).booleanValue();
    }

    @Override // defpackage.oww
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean d(Integer num) {
        if (num.intValue() < ((Integer) this.a.dL()).intValue()) {
            this.c = false;
        } else if (num.intValue() >= ((Integer) this.b.dL()).intValue()) {
            this.c = true;
        }
        return Boolean.valueOf(this.c);
    }
}
