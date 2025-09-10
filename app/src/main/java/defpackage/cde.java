package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cde {
    public final boolean a = false;
    public final int b = 0;

    public cde() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cde)) {
            return false;
        }
        cde cdeVar = (cde) obj;
        boolean z = cdeVar.a;
        int i = cdeVar.b;
        return a.p(0, 0);
    }

    public final int hashCode() {
        return a.o(false) * 31;
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=false, emojiSupportMatch=EmojiSupportMatch.Default)";
    }

    public cde(byte[] bArr) {
    }
}
