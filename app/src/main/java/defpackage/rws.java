package defpackage;

import androidx.compose.foundation.text.modifiers.Yk.LmJPKwPBa;
import com.google.googlex.gcam.dirtylens.PrCd.SHXc;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum rws {
    JAVA_VERSION("java.version"),
    b("java.vendor"),
    JAVA_VENDOR_URL("java.vendor.url"),
    JAVA_HOME("java.home"),
    JAVA_VM_SPECIFICATION_VERSION("java.vm.specification.version"),
    JAVA_VM_SPECIFICATION_VENDOR("java.vm.specification.vendor"),
    JAVA_VM_SPECIFICATION_NAME("java.vm.specification.name"),
    JAVA_VM_VERSION(LmJPKwPBa.BlDAebWRe),
    JAVA_VM_VENDOR("java.vm.vendor"),
    j("java.vm.name"),
    JAVA_SPECIFICATION_VERSION("java.specification.version"),
    JAVA_SPECIFICATION_VENDOR("java.specification.vendor"),
    JAVA_SPECIFICATION_NAME(SHXc.lAJFXwHkIy),
    JAVA_CLASS_VERSION("java.class.version"),
    JAVA_CLASS_PATH("java.class.path"),
    JAVA_LIBRARY_PATH("java.library.path"),
    JAVA_IO_TMPDIR("java.io.tmpdir"),
    JAVA_COMPILER("java.compiler"),
    JAVA_EXT_DIRS("java.ext.dirs"),
    OS_NAME("os.name"),
    OS_ARCH("os.arch"),
    OS_VERSION("os.version"),
    w("file.separator"),
    PATH_SEPARATOR("path.separator"),
    LINE_SEPARATOR("line.separator"),
    USER_NAME("user.name"),
    USER_HOME("user.home"),
    USER_DIR("user.dir");

    private final String D;

    rws(String str) {
        this.D = str;
    }

    public final String a() {
        return System.getProperty(this.D);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.D + "=" + a();
    }
}
