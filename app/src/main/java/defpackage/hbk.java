package defpackage;

import com.google.android.gms.common.internal.oQFY.clFzVRcygwbq;
import java.io.File;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hbk {
    public static final hbk a;
    private static final /* synthetic */ hbk[] c;
    public final File b;

    static {
        hbk hbkVar = new hbk();
        a = hbkVar;
        c = new hbk[]{hbkVar};
    }

    public static hbk[] values() {
        return (hbk[]) c.clone();
    }

    final boolean a() {
        return this.b.exists();
    }

    private hbk() {
        String str = clFzVRcygwbq.SDcuZZVqzO;
        this.b = new File("/sys/fs/selinux/enforce");
    }
}
