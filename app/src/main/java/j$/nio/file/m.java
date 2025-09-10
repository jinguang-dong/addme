package j$.nio.file;

import java.nio.file.OpenOption;

/* loaded from: classes3.dex */
public final /* synthetic */ class m implements o {
    public final /* synthetic */ OpenOption a;

    public /* synthetic */ m(OpenOption openOption) {
        this.a = openOption;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [j$.nio.file.o, java.nio.file.StandardOpenOption] */
    /* JADX WARN: Type inference failed for: r1v4, types: [j$.nio.file.o, java.nio.file.LinkOption] */
    public static /* synthetic */ o a(OpenOption openOption) {
        if (openOption == 0) {
            return null;
        }
        if (openOption instanceof n) {
            return ((n) openOption).a;
        }
        if (!(openOption instanceof LinkOption)) {
            return openOption instanceof B ? D.a((B) openOption) : new m(openOption);
        }
        return java.nio.file.LinkOption.NOFOLLOW_LINKS;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        OpenOption openOption = this.a;
        if (obj instanceof m) {
            obj = ((m) obj).a;
        }
        return openOption.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
