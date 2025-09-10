package defpackage;

import java.util.Random;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ukk extends ukp {
    public abstract Random a();

    @Override // defpackage.ukp
    public final int b() {
        return a().nextInt(2147418112);
    }
}
