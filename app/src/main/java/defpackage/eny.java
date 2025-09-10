package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eny {
    final String a;

    public eny(String str) {
        int length = str.length() - 14;
        if (length > 0) {
            enz.c(enz.a, "Tag " + str + " is " + length + " chars longer than limit.");
        }
        StringBuilder sb = new StringBuilder("CAM2PORT_");
        sb.append(length > 0 ? str.substring(0, 14) : str);
        this.a = sb.toString();
    }

    public final String toString() {
        return this.a;
    }
}
