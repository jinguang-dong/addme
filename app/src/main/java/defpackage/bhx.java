package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bhx extends RuntimeException {
    private final List a;

    public bhx(List list) {
        this.a = list;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        ugl uglVar = new ugl((byte[]) null);
        List listBv = ske.bv(this.a);
        if (((ufi) listBv).a() > 0) {
            throw null;
        }
        List listBv2 = ske.bv(ske.bi(uglVar));
        int iA = ((ufi) listBv2).a();
        for (int i = 0; i < iA; i++) {
            sb.append("\tat ".concat(String.valueOf((String) listBv2.get(i))));
            sb.append('\n');
        }
        return sb.toString();
    }
}
