package defpackage;

import android.util.Pair;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class jnr implements jnz {
    private static final sgv a = sgv.g("jnr");
    private final ltd b;
    private final Long c;
    private final owq d;

    public jnr(ltd ltdVar) {
        this.c = null;
        this.d = null;
        this.b = ltdVar;
    }

    @Override // defpackage.jnz
    public final syu a(mfo mfoVar, lsu lsuVar, rwc rwcVar, long j, mdm mdmVar) {
        return ske.L(new RuntimeException("No in-flight session found for ".concat(String.valueOf(String.valueOf(this.b)))));
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [sgt, shi] */
    @Override // defpackage.jnz
    public final syu b(mfo mfoVar, InputStream inputStream, lsu lsuVar, rwc rwcVar, long j, String str, mdm mdmVar) {
        owq owqVar;
        Long l = this.c;
        if (l != null && (owqVar = this.d) != null && l.longValue() >= ((Long) ((Pair) owqVar.dL()).first).longValue()) {
            owqVar.a(new Pair(l, true));
        }
        try {
            mdmVar.d(prh.F(inputStream, (ExifInterface) rwcVar.f(), lsuVar.b));
            lsuVar.b();
            return ske.M(mfoVar);
        } catch (IOException e) {
            ((sgt) ((sgt) a.b().i(e)).M((char) 2912)).s("Error while saving jpeg in finishMicrovideo");
            lsuVar.a();
            return ske.L(e);
        }
    }

    @Override // defpackage.jnz
    public final void c() {
        owq owqVar;
        Long l = this.c;
        if (l == null || (owqVar = this.d) == null || l.longValue() < ((Long) ((Pair) owqVar.dL()).first).longValue()) {
            return;
        }
        owqVar.a(new Pair(l, true));
    }

    public jnr(ltd ltdVar, Long l, owq owqVar) {
        this.b = ltdVar;
        this.c = l;
        this.d = owqVar;
    }
}
