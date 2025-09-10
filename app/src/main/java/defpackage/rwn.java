package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rwn extends rvl {
    final /* synthetic */ rvs f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rwn(rwr rwrVar, CharSequence charSequence, rvs rvsVar) {
        super(rwrVar, charSequence);
        this.f = rvsVar;
    }

    @Override // defpackage.rvl
    public final int a(int i) {
        return i + 1;
    }

    @Override // defpackage.rvl
    public final int b(int i) {
        CharSequence charSequence = this.b;
        int length = charSequence.length();
        rnt.T(i, length);
        while (i < length) {
            if (this.f.b(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
