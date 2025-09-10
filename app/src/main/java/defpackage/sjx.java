package defpackage;

import com.google.android.apps.camera.autotimer.analysis.jni.wVCD.HHdu;
import java.util.Arrays;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sjx extends LogRecord {
    private static final Object[] b;
    public final sja a;
    private final sid c;

    static {
        new sjw();
        b = new Object[0];
    }

    protected sjx(sid sidVar, sij sijVar) {
        super(sidVar.o(), null);
        this.c = sidVar;
        this.a = sja.g(sijVar, sidVar.k());
        shd shdVarF = sidVar.f();
        setSourceClassName(shdVarF.b());
        setSourceMethodName(shdVarF.d());
        setLoggerName(sidVar.n());
        setMillis(TimeUnit.NANOSECONDS.toMillis(sidVar.e()));
        super.setParameters(b);
    }

    @Override // java.util.logging.LogRecord
    public final String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            sid sidVar = this.c;
            sja sjaVar = this.a;
            sie sieVar = sje.a;
            if (sje.b(sidVar, sjaVar, sieVar.b)) {
                StringBuilder sb = new StringBuilder();
                sks.e(sidVar, sb);
                sje.c(sjaVar, sieVar.a, sb);
                message = sb.toString();
            } else {
                message = sje.a(sidVar);
            }
            super.setMessage(message);
        }
        return message;
    }

    @Override // java.util.logging.LogRecord
    public final void setMessage(String str) {
        if (str == null) {
            str = "";
        }
        super.setMessage(str);
    }

    @Override // java.util.logging.LogRecord
    public final void setParameters(Object[] objArr) {
        getMessage();
        if (objArr == null) {
            objArr = b;
        }
        super.setParameters(objArr);
    }

    @Override // java.util.logging.LogRecord
    public final void setResourceBundle(ResourceBundle resourceBundle) {
    }

    @Override // java.util.logging.LogRecord
    public final void setResourceBundleName(String str) {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" {\n  message: ");
        sb.append(getMessage());
        sb.append("\n  arguments: ");
        sb.append(getParameters() != null ? Arrays.asList(getParameters()) : "<none>");
        sb.append('\n');
        a(this.c, sb);
        sb.append("\n}");
        return sb.toString();
    }

    public static void a(sid sidVar, StringBuilder sb) {
        sb.append("  original message: ");
        if (sidVar.l() == null) {
            sb.append(sih.b(sidVar.m()));
        } else {
            sb.append(sidVar.l().b);
            sb.append("\n  original arguments:");
            for (Object obj : sidVar.L()) {
                sb.append("\n    ");
                sb.append(sih.b(obj));
            }
        }
        sij sijVarK = sidVar.k();
        if (sijVarK.b() > 0) {
            sb.append("\n  metadata:");
            for (int i = 0; i < sijVarK.b(); i++) {
                sb.append("\n    ");
                sb.append(sijVarK.c(i).a);
                sb.append(HHdu.lAAkaYqMkTzxa);
                sb.append(sih.b(sijVarK.e(i)));
            }
        }
        sb.append("\n  level: ");
        sb.append(sih.b(sidVar.o()));
        sb.append("\n  timestamp (nanos): ");
        sb.append(sidVar.e());
        sb.append("\n  class: ");
        sb.append(sidVar.f().b());
        sb.append("\n  method: ");
        sb.append(sidVar.f().d());
        sb.append("\n  line number: ");
        sb.append(sidVar.f().a());
    }

    public sjx(sid sidVar, sij sijVar, byte[] bArr) {
        this(sidVar, sijVar);
        setThrown((Throwable) this.a.b(sgy.a));
        getMessage();
    }

    public sjx(RuntimeException runtimeException, sid sidVar, sij sijVar) {
        this(sidVar, sijVar);
        setLevel(sidVar.o().intValue() < Level.WARNING.intValue() ? Level.WARNING : sidVar.o());
        setThrown(runtimeException);
        StringBuilder sb = new StringBuilder("LOGGING ERROR: ");
        sb.append(runtimeException.getMessage());
        sb.append('\n');
        a(sidVar, sb);
        setMessage(sb.toString());
    }
}
