package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class slu implements Appendable {
    final /* synthetic */ Appendable b;
    final /* synthetic */ String c = ":";
    int a = 2;

    public slu(Appendable appendable) {
        this.b = appendable;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) throws IOException {
        if (this.a == 0) {
            this.b.append(this.c);
            this.a = 2;
        }
        this.b.append(c);
        this.a--;
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        throw new UnsupportedOperationException();
    }
}
