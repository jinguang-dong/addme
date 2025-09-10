package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class etz implements fba {
    private final /* synthetic */ int a;

    public etz(int i) {
        this.a = i;
    }

    public static final eua b() {
        try {
            return new eua(MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.fba
    public final /* synthetic */ Object a() {
        int i = this.a;
        return i != 0 ? i != 1 ? new ArrayList() : new esv() : b();
    }
}
